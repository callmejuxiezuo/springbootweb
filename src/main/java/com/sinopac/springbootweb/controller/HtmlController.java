package com.sinopac.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HTML页面跳转
 * @author hp
 */
@Controller
public class HtmlController {

    /**
     * 访问static下的静态资源
     * @return
     */
    @RequestMapping("/hello")
    public String showHello() {
        return "html/hello.html";
    }


    /**
     * 访问META-INF/resources下的静态资源
     * @return
     */
    @RequestMapping("/helloTwo")
    public String showHelloTwo() {
        return "helloTwo.html";
    }

    /**
     * 访问resources下的静态资源
     * @return
     */
    @RequestMapping("/helloThree")
    public String showHelloThree() {
        return "helloThree.html";
    }

    /**
     * 访问public下的静态资源
     * @return
     */
    @RequestMapping("/helloFour")
    public String showHelloFour() {
        return "helloFour.html";
    }

    /**
     * 访问自定义myresource下的静态资源
     */
}
