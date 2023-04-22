package com.geekster.UserManagementSystem.service;

import com.geekster.UserManagementSystem.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class UserService {
    private static List<User> users=new ArrayList<>();
    static {
        users.add(new User(1,"shiv","shivachawade","bhopal","7089643415"));
    }


    public List<User> getUsers(){
        return users;
    }

    public String addUser(User user) {
        users.add(user);
        return "saved user";
    }


    public User findById(int userid) {
        Predicate<? super User> predicate = user -> user.getUserId() == userid;
        User user = users.stream().filter(predicate).findFirst().get();
        return user;

    }


    public void deleteUser(int id) {
        Predicate<? super User> predicate = user -> user.getUserId() == id;
        users.removeIf(predicate);
    }

    public void updateUser(int userid, User newUser) {

        User user =findById(userid);

        user.setUserId(newUser.getUserId());
        user.setUserName(newUser.getUserName());
        user.setName(newUser.getName());
        user.setPhoneNumber(newUser.getPhoneNumber());
        user.setAddress(newUser.getAddress());


    }
}
