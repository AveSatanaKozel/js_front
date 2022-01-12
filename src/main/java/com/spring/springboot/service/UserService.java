package com.spring.springboot.service;

import com.spring.springboot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void addUser(User user);

    void deleteUser(int id);

    User getByName(String username);

    User getUserById(int id) ;
}

