package com.atagan.dao;



import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.atagan.model.User;

@Repository
public class UserDao {

    private List<User> userList = Arrays.asList(
            new User("user1", "user1"),
            new User("user2","user2"));

    public List<User> getAllUsers() {
        return userList;
    }
}
