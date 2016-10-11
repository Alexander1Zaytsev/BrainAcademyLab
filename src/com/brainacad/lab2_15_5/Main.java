package com.brainacad.lab2_15_5;

import com.brainacad.lab2_15_4.MyNumGenerator;

/**
 * Created by User on 11/10/2016.
 */
public class Main {

    public static void main(String[] args) {

        MyNumGenerator distinctGenerator = new MyNumGenerator(5,64);
        System.out.println(distinctGenerator.generateDistinct());
    }
}
