package com.example.sharely.user;

import com.example.sharely.university.University;

import javax.persistence.*;

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
    @JoinColumn(name="university", referencedColumnName="universityId")
    private University university;

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

    public University getUniversityId() {
        return university;
    }

    public void setUniversityId(University universityId) {
        this.university = universityId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
