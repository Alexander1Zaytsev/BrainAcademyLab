package com.brainacad.lab2_17_6;

import java.util.concurrent.Semaphore;

/**
 * Created by User on 20/10/2016.
 */
public class Main {

    public static void main(String[] args) {

        Storage storage = new Storage();


        new Counter(1000000, storage).start();
        new Printer(storage).start();



    }
}
