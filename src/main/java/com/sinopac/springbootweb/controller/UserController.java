package com.sinopac.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Users;

/**
 * 功能描述:<br>
 *
 * @author hp
 * @date 2020-09-07 20:00
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/addUser")
    public String addUser(Users users) {
        //TODO 待跳转的页面
        return "";
    }
}
