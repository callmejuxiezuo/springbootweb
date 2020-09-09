package com.sinopac.springbootweb.service;


import com.sinopac.springbootweb.pojo.Users;

import java.util.List;

/**
 * 功能描述:<br>
 *
 * @author hp
 * @date 2020-09-07 20:04
 */
public interface UserService {
    /**
     * 添加用户
     * @param user
     */
    void addUser(Users user);

    /**
     * 查询所有用户
     * @return
     */
    List<Users> queryAllUser();
}
