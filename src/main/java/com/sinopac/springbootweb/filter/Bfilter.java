package com.sinopac.springbootweb.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * springboot 整合 Filter 方式2
 * @author hp
 */
public class Bfilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Bfilter doFilter... in");
        chain.doFilter(request, response);
        System.out.println("Bfilter doFilter... out");
    }

    @Override
    public void destroy() {

    }
}
