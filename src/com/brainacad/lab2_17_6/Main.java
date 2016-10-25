package com.brainacad.lab2_17_6;


/**
 * Created by User on 20/10/2016.
 */
public class Main {

    public static void main(String[] args) {

        Storage storage = new Storage();
        new Counter(10000, storage).start();
        new Printer(storage).start();

//        Counter counter = new Counter(10000,storage);
//        Printer printer = new Printer(storage);
//
//        new Thread(counter).start();
//        new Thread(printer).start();
    }
}
