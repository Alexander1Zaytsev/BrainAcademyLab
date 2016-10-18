package com.brainacad.lab2_17_2;

/**
 * Created by Alexander on 10/18/2016.
 */
public class Main {

    public static void main(String[] args) {

        MyTimeBomb bomb1 = new MyTimeBomb();
        Thread myBomb = new Thread(bomb1);
        myBomb.start();
    }
}
