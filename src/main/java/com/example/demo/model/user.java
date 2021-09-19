package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table

public class user {
    @Id
    @Column

    private int userId;
    @Column

    private String username;
    @Column 

    private String password;
    @Column

    private String phoneNumber;
    @Column

    private String email;
    public void setUserId(int userId){
        this.userId=userId;
    }
    public int getUserId(){
        return userId;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getUsername(){
        return username;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }




}
