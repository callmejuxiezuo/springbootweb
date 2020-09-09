package com.sinopac.springbootweb.service.impl;

import com.sinopac.springbootweb.dao.UserDao;
import com.sinopac.springbootweb.pojo.Users;
import com.sinopac.springbootweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 功能描述:<br>
 *
 * @author hp
 * @date 2020-09-07 20:05
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void addUser(Users user) {
        this.userDao.insertUser(user);
    }

    @Override
    public List<Users> queryAllUser() {

        return this.userDao.selectAllUsers();
    }

}
