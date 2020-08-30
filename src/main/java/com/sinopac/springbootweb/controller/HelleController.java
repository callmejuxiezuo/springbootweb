package com.sinopac.springbootweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  注意该文件的存放路径许在启动类下
 *  --spring-boot会自动加载启动类所在包下及其子包下的所有组件
 * @author hp
 */
@RestController // Controller + @ResponseBody 直接返回json，不做页面处理
public class HelleController {

    @RequestMapping("/login")
    public String returnHello() {
        return "successful";
    }

    @GetMapping("getMapping") // PostMapping/PutMapping/DeleteMapping
    public String getMappingHello() {
        return "getMapping";
    }

}
