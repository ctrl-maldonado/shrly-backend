package com.example.sharely.user;

import com.example.sharely.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/adduser")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @RequestMapping(value = "/users")
    public List<User> getAllUsers (){
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/user/{userId}")
    public User getSingleUser (@PathVariable Integer userId){
        return userService.getSingleUser(userId);
    }
}
