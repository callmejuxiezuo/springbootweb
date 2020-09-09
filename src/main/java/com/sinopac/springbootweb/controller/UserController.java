package com.sinopac.springbootweb.controller;

import com.sinopac.springbootweb.pojo.Users;
import com.sinopac.springbootweb.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


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

    @GetMapping("/getAllUsers")
    public String queryAllUsers(Model model) {
        List<Users> usersList = this.userService.queryAllUser();
        model.addAttribute("userList", usersList);
        return "queryAllUser";
    }
}
