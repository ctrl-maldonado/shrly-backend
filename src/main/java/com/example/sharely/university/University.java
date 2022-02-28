package com.example.sharely.university;

import com.example.sharely.user.User;

import javax.persistence.*;
import java.util.List;

@Entity ( name = "University")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int universityId;
    private String universityName;
    private long creationDate;

    public University(int universityId, String universityName, long creationDate) {
        this.universityId = universityId;
        this.universityName = universityName;
        this.creationDate = creationDate;
    }

    public University() {
    }

    public int getUniversityId() {
        return universityId;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }
}
