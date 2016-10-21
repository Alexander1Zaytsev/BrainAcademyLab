package com.brainacad.lab2_17_6;

/**
 * Created by User on 20/10/2016.
 */
public class Storage {

    private int store;

    public void setStore(int store) {
        this.store = store;
    }

    public int getStore() {
        return store;
    }

    public boolean ready(){
        return store != 0;
    }
}
