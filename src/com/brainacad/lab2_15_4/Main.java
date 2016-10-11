package com.brainacad.lab2_15_4;

/**
 * Created by Alexander on 10/11/2016.
 */
public class Main {

    public static void main(String[] args) {

        MyNumGenerator numGenerator = new MyNumGenerator(5,64);
        System.out.println(numGenerator.generate());
    }
}
