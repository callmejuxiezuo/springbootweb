package com.sinopac.springbootweb.pojo;


import com.sun.istack.internal.NotNull;

import java.io.Serializable;

/**
 * Users 对象
 */
public class Users implements Serializable {
//    @NotBlank // 对字符串类型做非空校验
//    @NotEmpty // 集合类型

    private String userName;
    @NotNull //基本数据的对象做控制
    private Integer age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Users(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

    public Users() {

    }
}
