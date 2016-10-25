package com.brainacad.lab2_17_11;

/**
 * Created by Alexander on 10/24/2016.
 */
public class Write extends Thread {

    Storage storage;

    public Write(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run(){
        storage.cmap.put("1", "A");
        storage.cmap.put("2", "B");
        storage.cmap.put("3", "C");
        storage.cmap.put("4", "D");
        storage.cmap.put("5", "E");
        storage.cmap.put("6", "F");
        storage.cmap.put("7", "G");
        storage.cmap.put("8", "H");
        storage.cmap.put("9", "I");
        storage.cmap.put("10", "J");

        storage.map.put("1", "A");
        storage.map.put("2", "B");
        storage.map.put("3", "C");
        storage.map.put("4", "D");
        storage.map.put("5", "E");
        storage.map.put("6", "F");
        storage.map.put("7", "G");
        storage.map.put("8", "H");
        storage.map.put("9", "I");
        storage.map.put("10", "J");
    }
}
