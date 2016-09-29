package com.brainacad.lab2_11_3;

/**
 * Created by Alex on 9/29/2016.
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person();

        try {
            person.setAge(125);
        } catch (InvalidAgeException e){
            System.out.println("The age is incorrect. Change the age");
        }



    }
}
