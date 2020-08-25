package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;

    public User() {
    }

    public User(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String fn) {
        this.firstName = fn;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String ln) {
        this.lastName = ln;
    }

    public String toString() {
        return String.format("User[firstName: %s, lastName: %s]", this.firstName, this.lastName);
    }
}