package com.sinopac.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLTimeoutException;

/**
 * 异常处理
 * @author hp
 */
@Controller
public class ExceptionController {

    @ExceptionHandler(value = {java.lang.NullPointerException.class, SQLTimeoutException.class}) // 返回值必须是ModelAndView
    public ModelAndView showException1(Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error", e.toString());
        // 若报错，指定错误页面;可根据不同错误跳转不同页面
        modelAndView.setViewName("error");
        return modelAndView;
    }

    
}
