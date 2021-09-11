package com.example.demo;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private long id;

    private String firstName;
    private String lastName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
