package com.zhyidi.book.web;

import com.zhyidi.book.pojo.User;
import com.zhyidi.book.service.UserService;
import com.zhyidi.book.service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RegistServlet", value = "/RegistServlet")
public class RegistServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String code = request.getParameter("code");
        //这里写死检查
        if("abcde".equalsIgnoreCase(code)){
            if(userService.existUsername(username)){
                request.getRequestDispatcher("/pages/user/regist.html").forward(request,response);
            }else{
                userService.RegistUser(new User(null,username,password,email));
                request.getRequestDispatcher("/pages/user/regist_success.html").forward(request,response);
            }
        }else{
            request.getRequestDispatcher("/pages/user/regist.html").forward(request,response);
        }
    }
}
