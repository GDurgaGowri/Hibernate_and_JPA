package com.springtutorial.cruddemo;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class student {
    //feilds
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="first_name")
    private String first_name;
    @Column(name="last_name")
    private String lastName;
    @Column(name="email")
    private String email;
    public student(){

    }
    public student(String first_name,String lastName,String email){
        this.first_name=first_name;
        this.lastName=lastName;
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
