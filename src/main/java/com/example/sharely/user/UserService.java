package com.example.sharely.user;

import com.example.sharely.Repository.UniversityRepository;
import com.example.sharely.Repository.UserRepository;
import com.example.sharely.university.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    @Autowired
    UniversityRepository universityRepository;

    public User addUser(User user) {
        user.setCreationDate(System.currentTimeMillis());
        return userRepository.save(user);

    }

    public User getSingleUser(Integer userId) {
        return userRepository.findByUserId(userId);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
