package dao.impl;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pojo.Users;

/**
 * 功能描述:<br>
 *
 * @author hp
 * @date 2020-09-08 19:09
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 添加用户
     * @param users
     */
    @Override
    public void insertUser(Users users) {
        String sql = "insert into user(username, age) values(?, ?)";
        jdbcTemplate.update(sql, users.getUserName(), users.getAge());
    }
}
