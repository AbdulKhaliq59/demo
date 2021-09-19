package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.repository.userRepository;

import java.util.ArrayList;

import com.example.demo.model.user;

@Service

public class userService {
    @Autowired
    userRepository user;
    public List<user> getAllUsers(){
        List<user> users= new ArrayList<user>();
        user.findAll().forEach(user1->users.add(user1));
        return users;
    }
    public user getUserById(int id){
        return user.findById(id).get();
    }
    public void saveOrUpdate(user userData){
        user.save(userData);
    }
    public void delete(int id){
        user.deleteById(id);
    }
    public void update(user userData,int id){
        user.save(userData);
    }
}
