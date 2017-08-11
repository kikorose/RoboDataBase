package me.kikorose.demo.models;


import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class Person {

    private long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;

    private ArrayList<Education> edu;
    private ArrayList<Experience> exp;
    private ArrayList<Skills> skills;




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}