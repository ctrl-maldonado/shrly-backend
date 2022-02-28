package com.example.sharely.university;

import com.example.sharely.Repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityService {

    @Autowired
    UniversityRepository universityRepository;

    public void addUniversity(University university) {
        university.setCreationDate(System.currentTimeMillis());
        universityRepository.save(university);
    }
}
