package com.sinopac.springbootweb.controller;

import com.sinopac.springbootweb.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hp
 */
@Controller
public class PageController {

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){

        return page;
    }

    /**
     * 跳转到含有页面对象的page,通过给对象users,springMVC会自动传入到Model
     * @param page
     * @param users
     * @return
     */
    @RequestMapping("/{page}")
    public String showPage2(@PathVariable String page, Users users){//通过 @ModelAttribute("XX")改变页面users的key名

        return page;
    }
}
