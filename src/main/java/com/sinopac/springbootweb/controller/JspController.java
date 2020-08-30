package com.sinopac.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * JSP页面跳转
 * @author hp
 */
@Controller
public class JspController {
    /**
     * jsp 动态跳转
     * @param page
     * @return
     */
    @GetMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }
}
