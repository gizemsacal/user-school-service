package com.example.userschoolservice.service;

import com.example.userschoolservice.model.User;

import java.util.List;

public interface UserService {
    public User createUser(User user);

    public User getUser(Integer id);

    public User updateUser(User user, Integer id);

    public void deleteUser(Integer id);

    public User getUserByUserName(String name);


    public List<User> getAllUsers();
}
