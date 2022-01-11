package com.spring.springboot.controller;

import com.spring.springboot.model.User;
import com.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class AdminRestController {

    private UserService userService;


    @Autowired
    public AdminRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List<User> allUsers() {                     // выводит всех User's
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") int id) {         //User по id
        return userService.getUserById(id);
    }

    @PostMapping()
    public User addUser(@RequestBody User user) {          // добавить User
        userService.addUser(user);
        return user;
    }

    @PutMapping()
    public User editUser(@RequestBody User user) {               // изменить User
        userService.addUser(user);
        return user;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") int id) {           // удалить User по  id
        userService.deleteUser(id);
    }
}




