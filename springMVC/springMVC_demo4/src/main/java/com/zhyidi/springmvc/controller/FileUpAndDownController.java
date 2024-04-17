package com.zhyidi.springmvc.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/21 9:02
 * @Version 1.0
 */
@Controller
public class FileUpAndDownController {
    @RequestMapping("/testDown")
    public ResponseEntity<byte[]> testResponseEntity(HttpSession session) throws IOException {
        //获取ServletContext对象
        ServletContext servletContext = session.getServletContext();
        //获取服务器中文件的真实路径
        String realPath = servletContext.getRealPath("/static/image/1.jpg");
        System.out.println(realPath);
        //创建输入流
        InputStream is = new FileInputStream(realPath);
        //创建字节数组
        byte[] bytes = new byte[is.available()];
        //将流读到字节数组中
        is.read(bytes);
        //创建HttpHeaders对象设置响应头信息
        MultiValueMap<String, String> headers = new HttpHeaders();
        //设置要下载方式以及下载文件的名字
        headers.add("Content-Disposition", "attachment;filename=1.jpg");
        //设置响应状态码
        HttpStatus statusCode = HttpStatus.OK;
        //创建ResponseEntity对象
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, headers,
                statusCode);
        //关闭输入流
        is.close();
        return responseEntity;
    }
    @RequestMapping(value = "/testUp")
    public String testUp(MultipartFile photo,HttpSession session) throws IOException {
        //获取上传文件的文件名
        String originalFilename = photo.getOriginalFilename();
        //解决文件重名问题
        String suffixname = originalFilename.substring(originalFilename.lastIndexOf('.'));
        String uuid = UUID.randomUUID().toString();
        //服务器获取接收路径
        ServletContext servletContext = session.getServletContext();
        String photo_Path = servletContext.getRealPath("photo");
        File file = new File(photo_Path);
        if(!file.exists()){
            file.mkdir();
        }

        String finalname = photo_Path+File.separator+uuid+suffixname;
        //开始上传
        photo.transferTo(new File(finalname));
        return "success";
    }
}
