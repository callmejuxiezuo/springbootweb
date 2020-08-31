package com.sinopac.springbootweb.controller;

import com.sinopac.springbootweb.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Thymeleaf页面跳转
 * @author hp
 */
@Controller
public class ThymeleafController {
    @GetMapping("/thymeleaf")
    public  String showThymeleaf(Model model, HttpServletRequest request) {
        model.addAttribute("Thymeleaf", "showThymeleaf");
        model.addAttribute("date", new Date());
        model.addAttribute("age", "22");

        // 迭代遍历List
        List<Users> showUsersList = new ArrayList<Users>();
        Users userOne = new Users("ZhangSan", 23);
        Users userTwo = new Users("LiSi", 22);
        Users userThree = new Users("王五", 21);
        showUsersList.add(userOne);
        showUsersList.add(userTwo);
        showUsersList.add(userThree);
        model.addAttribute("usersList", showUsersList);

        // 迭代遍历Map
        Map<String, Users> userMap = new HashMap<>(3);
        userMap.put("userOne", userOne);
        userMap.put("userTwo", userTwo);
        userMap.put("userThree", userThree);
        model.addAttribute("userMap", userMap);

        //域对象
        request.setAttribute("request", "request");
        request.getSession().setAttribute("session", "session");
        request.getSession().getServletContext().setAttribute("servletContext", "servletContext");

        return "thymeleaf";
    }
}
