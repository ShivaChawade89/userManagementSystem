package com.geekster.UserManagementSystem.controller;

import com.geekster.UserManagementSystem.model.User;
import com.geekster.UserManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.function.Predicate;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping(value = "/getAllUser")
    public List<User> users(){
        return userService.getUsers();
    }


    @PostMapping(value="/addUser")
    public String addUser(@RequestBody User user) {
         return userService.addUser(user);
    }


    @GetMapping("/getUser/{userid}")
    //@RequestMapping(value="/find-todo/id/{id}")
    public User findUserById(@PathVariable int userid) {
        return userService.findById(userid);
    }
    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable int id){
        userService.deleteUser(id);
    }

    @PutMapping("updateUserInfo/{userid}")
    public void updateUser(@PathVariable int userid,@RequestBody User user) {
        userService.updateUser(userid,user);
    }
}
