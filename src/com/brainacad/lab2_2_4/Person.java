package com.brainacad.lab2_2_4;

/**
 * Created by Alex on 9/11/2016.
 */
public class Person {
    public String firstName;
    public String lastName;
    public int age;
    public String gender;
    public long phoneNumber;

    public void set(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void set(String gender) {
        this.gender = gender;
    }

    public void set(int age) {
        this.age = age;
    }

    public void set(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
