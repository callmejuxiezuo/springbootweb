package com.sinopac.springbootweb.pojo;


import java.io.Serializable;

/**
 * Users 对象
 */
public class Users implements Serializable {
    private String userName;
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