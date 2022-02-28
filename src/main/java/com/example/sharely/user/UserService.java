package com.example.sharely.user;

import com.example.sharely.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void addUser(User user) {
        user.setCreationDate(System.currentTimeMillis());
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        System.out.println(formatter.format(user.getCreationDate()));
        userRepository.save(user);
    }

    public User getSingleUser(Integer userId) {
        return userRepository.findByUserId(userId);
    }

    //kommentar
}
