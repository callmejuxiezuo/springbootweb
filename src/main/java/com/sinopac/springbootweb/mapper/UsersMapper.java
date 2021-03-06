package com.sinopac.springbootweb.mapper;

import com.sinopac.springbootweb.pojo.Users;
import org.springframework.stereotype.Repository;

/**
 * 功能描述:<br>
 *
 * @author hp
 * @date 2020-09-07 20:10
 */
@Repository
public interface UsersMapper {
    /**
     * UserMapper
     * @param users
     */
    void addUser(Users users);
}
