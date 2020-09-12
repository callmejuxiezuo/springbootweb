package com.sinopac.springbootweb;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 启动类
 * @author hp
 */
@SpringBootApplication
@ServletComponentScan //扫描@WebServlet/WebFilter/@WebListener，实列化之
@MapperScan("com.sinopac.springbootweb.mapper") // 扫描mapper包下的接口与映射
public class SpringbootwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootwebApplication.class, args);
    }

}
