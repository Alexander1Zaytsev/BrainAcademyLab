package com.brainacad.lab2_17_6;

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
    public void run(){
        for(int i = 0; i < n; i++){
            //storage.setStore(i);
        }
    }
}
