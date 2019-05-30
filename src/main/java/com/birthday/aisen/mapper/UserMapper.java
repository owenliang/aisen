package com.birthday.aisen.mapper;

import com.birthday.aisen.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    User getUserById(long uid);
    List<User> getUsersByName(String username);
}
