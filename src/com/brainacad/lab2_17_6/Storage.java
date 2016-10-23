package com.brainacad.lab2_17_6;

/**
 * Created by User on 20/10/2016.
 */
public class Storage {

    private int store;
    private boolean readyToPrint = false;

    public void setStore(int store) {
        this.store = store;
    }

    public int getStore() {
        return store;
    }

    public boolean isReadyToPrint(){
        return readyToPrint;
    }

    public void setReadyToPrint(boolean readyToPrint){
        this.readyToPrint = readyToPrint;
    }
}
