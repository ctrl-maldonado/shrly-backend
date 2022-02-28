package com.example.sharely.university;

import com.example.sharely.Repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniversityController {

    @Autowired
    UniversityService universityService;

    @Autowired
    UniversityRepository universityRepository;

    @RequestMapping(value = "/universities")
    public ResponseEntity getAllUniversities (){
        return ResponseEntity.ok(this.universityRepository.findAll());
    }

    @RequestMapping(value = "/adduniversity")
    public void addUniversity (@RequestBody University university){
        universityService.addUniversity(university);
    }
}
