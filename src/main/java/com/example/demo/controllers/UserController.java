package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.demo.Service.userService;
import com.example.demo.model.user;
@RestController
public class UserController {
    @Autowired
    userService users;
    @GetMapping("/")
    
private String get(){
        return "Welcome To spring boot App";
    }
    @GetMapping("/user")
    private List<user> getAllUsers(){
        return users.getAllUsers();
    }
    @PostMapping("/user")
    private int addUser(@RequestBody user userData){
        users.saveOrUpdate(userData);
    return userData.getUserId();
    }


@PutMapping("/user")
private user UpdateUser(@RequestBody user userData){
     users.saveOrUpdate(userData);
     return userData;
}
@DeleteMapping("/user/{id}")
private void DeleteUser(@PathVariable("id") int userId){
    users.delete(userId);
    //return "User Deleted Successfully";
}
}
