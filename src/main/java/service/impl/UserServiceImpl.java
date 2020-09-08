package service.impl;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.Users;
import service.UserService;

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
}
