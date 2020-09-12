package com.sinopac.springbootweb;

import com.sinopac.springbootweb.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootwebApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {

    }

    @Test
    void setUserServiceTest(){
        this.userService.queryAllUser();
    }

}
