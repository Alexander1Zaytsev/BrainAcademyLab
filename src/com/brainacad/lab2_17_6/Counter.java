package com.brainacad.lab2_17_6;


import java.util.concurrent.locks.Lock;

/**
 * Created by User on 20/10/2016.
 */
public class Counter extends Thread {
    int n;
    Storage storage;

    public Counter(int n, Storage storage) {
        this.n = n;
        this.storage = storage;
    }

    @Override
    public void run() {

        
        for (int i = 1; i < n; i++) {

                    storage.setStore(i);
                    storage.setReadyToPrint(true);

                    try {
                        storage.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }



            }

    }
}
