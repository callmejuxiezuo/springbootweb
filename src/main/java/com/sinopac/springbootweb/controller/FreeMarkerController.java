package com.sinopac.springbootweb.controller;

import com.sinopac.springbootweb.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * FreeMarker页面跳转
 * @author hp
 */
@Controller
public class FreeMarkerController {

    @GetMapping("/freemarker")
    public String showFreeMarkerView(Model model) {
        List<Users> showUsersList = new ArrayList<Users>();
        Users userOne = new Users("ZhangSan", 23);
        Users userTwo = new Users("LiSi", 22);
        showUsersList.add(userOne);
        showUsersList.add(userTwo);
        model.addAttribute("List", showUsersList);
        // 返回定义的视图,动态资源存在templates目录下的.ftl文件
        return "ShowUsersList";
    }


}
