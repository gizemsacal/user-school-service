package com.example.userschoolservice.controller;

import com.example.userschoolservice.model.User;
import com.example.userschoolservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private UserService userService;

    final UserService userServiceImpl;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/user")
    User creatUser(@RequestBody User user) {
        return userServiceImpl.createUser(user);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/user/id/{id}")
    public User getUser(@PathVariable Integer id) {
        return userServiceImpl.getUser(id);
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/user/name/{name}")
    public User getUserByUserName(@PathVariable String name) {
        return userServiceImpl.getUserByUserName(name);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/user/{id}")
    User updateUser(@RequestBody User user, @PathVariable Integer id) {
        return userServiceImpl.updateUser(user, id);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("user/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userServiceImpl.deleteUser(id);
    }
    @GetMapping("users")
    public List<User> getAllUsers(){
        return userServiceImpl.getAllUsers();
    }
}
