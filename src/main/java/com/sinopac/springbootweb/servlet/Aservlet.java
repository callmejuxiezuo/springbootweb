package com.sinopac.springbootweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * springboot 整合 Servlet 方式1
 * @author hp
 */
@WebServlet(name = "AaServlet", urlPatterns = "/AaA") // 让其拦截AaA
public class Aservlet extends HttpServlet {

    // http://localhost:8082/AaA
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("AServlet");
//        super.doGet(req, resp);
    }
}
