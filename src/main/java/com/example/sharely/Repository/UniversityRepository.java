package com.example.sharely.Repository;

import com.example.sharely.university.University;
import com.example.sharely.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends JpaRepository<University, Integer> {

}
