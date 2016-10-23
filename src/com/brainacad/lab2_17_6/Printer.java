package com.brainacad.lab2_17_6;

import java.util.concurrent.Semaphore;

/**
 * Created by User on 20/10/2016.
 */
public class Printer extends Thread {
    Storage storage;
    private volatile boolean finished = false;

    public Printer(Storage storage) {
        this.storage = storage;
    }



    @Override
    public void run() {

            synchronized (storage) {
                while (!storage.isReadyToPrint()) {
                    try {
                        storage.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(storage.getStore());
                storage.setReadyToPrint(false);
            }

    }
}
