package com.brainacad.lab2_17_6;


/**
 * Created by User on 20/10/2016.
 */
public class Printer extends Thread implements Runnable {
    Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {

        synchronized (storage) {
            while (!storage.isJobDone()) {
                while (storage.isReadyToSet()) {
                    try {
                        storage.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(storage.getStore());
                storage.setReadyToSet(true);
                storage.notify();
            }
        }
    }
}
