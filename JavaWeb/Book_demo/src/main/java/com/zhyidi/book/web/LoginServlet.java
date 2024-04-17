package com.zhyidi.book.web;

import com.zhyidi.book.pojo.User;
import com.zhyidi.book.service.UserService;
import com.zhyidi.book.service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(userService.login(new User(null,username,password,null))){
            request.getRequestDispatcher("/pages/user/login_success.html").forward(request,response);
        }else {
            request.getRequestDispatcher("/pages/user/login.html").forward(request,response);
        }

    }
}
