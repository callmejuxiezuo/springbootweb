package com.sinopac.springbootweb.config;

import com.sinopac.springbootweb.filter.Bfilter;
import com.sinopac.springbootweb.listener.Blistener;
import com.sinopac.springbootweb.servlet.Bservlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 * @author hp
 */
@Configuration
public class Config {
    /**
     * Servlet配置
     * 注册Servlet,解析Bean
     */
    @Bean // 切莫忘记该标签
    public ServletRegistrationBean getServletBean() {

        ServletRegistrationBean servlsetBean = new ServletRegistrationBean(new Bservlet());

        servlsetBean.addUrlMappings("/BbB");
        return servlsetBean;
    }

    /**
     * Filter配置
     * 注册Filter,解析Bean
     */
    @Bean
    public FilterRegistrationBean getFilterBean() {
        FilterRegistrationBean filterBean = new FilterRegistrationBean(new Bfilter());
        // 注意参数是可变参数，可放置多个拦截  new String[]{"*.do", "*.jsp", "*.html"}
        filterBean.addUrlPatterns("/BbB");
        return filterBean;
    }

    /**
     * Listener配置
     * 注册Listener,解析Bean
     */
    @Bean
    public ServletListenerRegistrationBean getListenerBean() {
        ServletListenerRegistrationBean listenerBean = new ServletListenerRegistrationBean(new Blistener());
        return listenerBean;
    }

}
