package com.sinopac.springbootweb.dao.impl;

import com.sinopac.springbootweb.dao.UserDao;
import com.sinopac.springbootweb.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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

    @Override
    public List<Users> selectAllUsers() {
        String sql = "select * from user";
        return  jdbcTemplate.query(sql, new RowMapper<Users>() {
            @Override
            public Users mapRow(ResultSet resultSet, int i) throws SQLException {
                Users users = new Users();
                users.setAge(resultSet.getInt("age"));
                users.setUserName(resultSet.getString("username"));
                return users;
            }
        });

    };
}
