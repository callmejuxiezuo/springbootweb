package com.sinopac.springbootweb.exception;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLTimeoutException;
import java.util.Properties;

/**
 *  集中处理异常
 * @author hp
 */
//@ControllerAdvice // 全局处理异常
@Configuration
public class AppException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView modelAndView = new ModelAndView();
        // 自行判断错误对象，实现映射
        if(ex instanceof NullPointerException) {
            modelAndView.setViewName("error");

        }else if(ex instanceof SQLTimeoutException) {


        }else {

        }
        // 传递异常信息
        modelAndView.addObject("error", ex.toString());
        return modelAndView;
    }

    /*@ExceptionHandler(value = {java.lang.NullPointerException.class, SQLTimeoutException.class}) // 返回值必须是ModelAndView
    public ModelAndView showException(Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error", e.toString());
        // 若报错，指定错误页面;可根据不同错误跳转不同页面
        modelAndView.setViewName("error");
        return modelAndView;
    }*/

   /* @Bean
    public SimpleMappingExceptionResolver showException2() {
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
        // 映射异常,key=异常类型，vaule=视图名
        Properties pro = new Properties();
        pro.put("java.lang.NullPointerException", "error");
        resolver.setExceptionMappings(pro);
        return resolver;
    }*/
}
