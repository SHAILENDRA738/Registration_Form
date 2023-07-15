package com.example.Registration_Form.Entity;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table (name="User_Dtls")
public class UserDtls {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UserId;

    private String FirstName;

    private String LastName;

    private String Gender;
    private String DOB;
    private String Mobile;
    private String Email;
    private String Password;

    public UserDtls() {
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "UserDtls{" +
                "UserId=" + UserId +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Gender='" + Gender + '\'' +
                ", DOB='" + DOB + '\'' +
                ", Mobile='" + Mobile + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}

