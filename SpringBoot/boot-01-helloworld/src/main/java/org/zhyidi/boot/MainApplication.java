package org.zhyidi.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description:主程序类（所有启动的入口）
 * @Author zhyidi
 * @Date: 2022/6/7 16:47
 * @Version 1.0
 */
//这是一个springboot应用
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }
}
