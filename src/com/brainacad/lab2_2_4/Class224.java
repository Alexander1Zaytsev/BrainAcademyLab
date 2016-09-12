package com.brainacad.lab2_2_4;

/**
 * Created by Alex on 9/11/2016.
 */
public class Class224 {
    public static void main(String[] args) {
        Person first = new Person();

        first.set("Petro", "Petrenko");
        first.set("male");
        first.set(35);  // if byte or short and phoneNumber integer - doesn't work correctly
        first.set(985224546L);

        System.out.println(first.firstName + " " + first.lastName + " " + first.gender + " " + first.age  + " " + first.phoneNumber);

    }
}
