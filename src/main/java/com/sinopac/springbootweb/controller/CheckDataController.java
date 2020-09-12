package com.sinopac.springbootweb.controller;

import com.sinopac.springbootweb.pojo.Users;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;

import java.util.List;

/**
 * 实体数据校验
 * 参数校验
 * @author hp
 */
public class CheckDataController {

    public void show1(@Validated Users users, BindingResult result) {
        // 不合法信息存在result
        if(result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for(ObjectError error : list) {
                FieldError fieldError = (FieldError) error;
                // 属性名
                fieldError.getField();
                // 错误信息
                fieldError.getDefaultMessage();

                // 页面取值
                /*  对象.属性
                    th:errors="${users.userName}"
                 */
            }
        }
    }
}
