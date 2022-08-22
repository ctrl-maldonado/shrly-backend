package com.example.sharely.user;

import com.example.sharely.document.Document;
import com.example.sharely.university.University;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity( name = "ShrlyUser" ) //Table name is called 'ShrlyUser' because the are interefering problems with native Table called 'user'
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String userName;
    private Long creationDate;
    private String password;
    private String email;

    @ManyToOne
    @JoinColumn(name="universityId", referencedColumnName="universityId")
    private University university;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private Set<Document> documents = new HashSet<>();

    public User() {
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", creationDate=" + creationDate +
                ", password='" + password + '\'' +
                ", university=" + university +
                ", email='" + email + '\'' +
                '}';
    }
}
