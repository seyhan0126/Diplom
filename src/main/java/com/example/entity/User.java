package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true, length = 45, name = "first_name")
    private String fname;
    @Column(nullable = false, unique = true, length = 45, name = "last_name")
    private String lname;
    @Column(nullable = false, unique = true, length = 45, name = "email")
    private String email;
    @Column(length = 20, name = "password")
    private String password;

}
