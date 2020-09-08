package dao;

import pojo.Users;

/**
 * 功能描述:<br>
 *
 * @author hp
 * @date 2020-09-08 19:05
 */
public interface UserDao {

    /**
     * 添加用户
     * @param users
     */
    void insertUser(Users users);
}
