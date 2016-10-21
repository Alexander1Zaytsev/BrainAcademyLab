package com.brainacad.lab2_17_6;

import java.util.concurrent.Semaphore;

/**
 * Created by User on 20/10/2016.
 */
public class Printer extends Thread {
    Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run(){
            while (storage.ready()) {
                System.out.println(storage.getStore());
            }

    }
}
