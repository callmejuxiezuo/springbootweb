package com.sinopac.springbootweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Users;
import service.UserService;

/**
 * 功能描述:<br>
 *
 * @author hp
 * @date 2020-09-07 20:00
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public String addUser(Users users) {
        try {
            this.userService.addUser(users);
            //TODO 待跳转的页面

        }catch (Exception e) {
            // TODO 处理异常
            return "failed";
        }

        // 重定向
        return "redirect:/successful";
    }
}
