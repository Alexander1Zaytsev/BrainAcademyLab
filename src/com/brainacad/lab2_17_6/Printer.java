package com.brainacad.lab2_17_6;

/**
 * Created by User on 20/10/2016.
 */
public class Printer extends Thread {
    Storage storage;

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run(){
        System.out.println(storage.getStore());
    }
}
