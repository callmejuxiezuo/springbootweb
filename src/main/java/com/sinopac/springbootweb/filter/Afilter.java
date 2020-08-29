package com.sinopac.springbootweb.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * springboot 整合 Filter 方式1
 * @author hp
 */
@WebFilter(filterName = "Afilter", urlPatterns = "/AaA") //urlPatterns = {"*.do", "*.jsp", "*.html"}
public class Afilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Afilter doFilter... in");
        chain.doFilter(request, response);
        System.out.println("Afilter doFilter... out");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
      //  System.out.println("Afilter init...");
    }

    @Override
    public void destroy() {
       // System.out.println("Afilter destroy...");
    }
}
