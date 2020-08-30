package com.sinopac.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

/**
 * Thymeleaf页面跳转
 * @author hp
 */
@Controller
public class ThymeleafController {
    @GetMapping("thymeleaf")
    public  String showThymeleaf(Model model) {
        model.addAttribute("Thymeleaf", "showThymeleaf");
        model.addAttribute("date", new Date());
        return "thymeleaf";
    }
}
