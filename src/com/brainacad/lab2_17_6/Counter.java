package com.brainacad.lab2_17_6;

import java.util.concurrent.Semaphore;

/**
 * Created by User on 20/10/2016.
 */
public class Counter extends Thread {
    int n;
    Storage storage;
    boolean flag = true;


    public Counter(int n, Storage storage) {
        this.n = n;
        this.storage = storage;
    }

    public void setFlag(boolean b){
        this.flag = b;
    }

    @Override
    public void run() {
        synchronized (storage) {
            for (int i = 1; i < n; i++) {
                storage.setStore(i);
                while (storage.ready()) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        storage.setStore(0);
    }
}
