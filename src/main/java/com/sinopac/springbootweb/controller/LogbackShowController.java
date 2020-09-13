package com.sinopac.springbootweb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 日志使用演示。springboot内置LogBack
 * @author hp
 */
@Controller
@RequestMapping("gotoLogBack")
public class LogbackShowController {

    private final static Logger logger = LoggerFactory.getLogger(LogbackShowController.class);

    // 从配置文件中获取屏蔽的日志级别

    @Value("{logging.level.com}")
    private String logLevel;

    @GetMapping("/printLogBack")
    public void printLogBack() {
        logger.info("printLogBack");
    }
}
