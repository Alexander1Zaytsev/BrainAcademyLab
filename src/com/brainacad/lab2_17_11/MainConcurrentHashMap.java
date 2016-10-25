package com.brainacad.lab2_17_11;


/**
 * Created by Alexander on 10/24/2016.
 */
public class MainConcurrentHashMap {

    public static void main(String[] args) {

        Storage storage = new Storage();

        Write write = new Write(storage);
        Read read = new Read(storage);

        read.start();
        write.start();
    }
}
