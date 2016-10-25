package com.brainacad.lab2_17_6;


/**
 * Created by User on 20/10/2016.
 */
public class Counter extends Thread implements Runnable {
    int n;
    Storage storage;

    public Counter(int n, Storage storage) {
        this.n = n;
        this.storage = storage;
    }

    @Override
    public void run() {

        for (int i = 1; i < n; i++) {
            synchronized (storage) {
                while (!storage.isReadyToSet()) {
                    try {
                        storage.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                storage.setStore(i);
                storage.setReadyToSet(false);
                storage.notify();
            }
        }

        synchronized (storage) {
            storage.setJobDone(true);
            storage.notify();
        }
    }
}
