package com.brainacad.lab2_17_11;

/**
 * Created by Alexander on 10/24/2016.
 */
public class Read extends Thread {

    Storage storage;

    public Read(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run(){
        System.out.println(storage.cmap.get("1") + " ConcurrentHashMap");
        System.out.println(storage.cmap.get("2") + " ConcurrentHashMap");
        System.out.println(storage.cmap.get("3") + " ConcurrentHashMap");
        System.out.println(storage.cmap.get("4") + " ConcurrentHashMap");
        System.out.println(storage.cmap.get("5") + " ConcurrentHashMap");
        System.out.println(storage.cmap.get("6") + " ConcurrentHashMap");
        System.out.println(storage.cmap.get("7") + " ConcurrentHashMap");
        System.out.println(storage.cmap.get("8") + " ConcurrentHashMap");
        System.out.println(storage.cmap.get("9") + " ConcurrentHashMap");
        System.out.println(storage.cmap.get("10") + " ConcurrentHashMap");

        System.out.println(storage.map.get("1") + " HashMap");
        System.out.println(storage.map.get("2") + " HashMap");
        System.out.println(storage.map.get("3") + " HashMap");
        System.out.println(storage.map.get("4") + " HashMap");
        System.out.println(storage.map.get("5") + " HashMap");
        System.out.println(storage.map.get("6") + " HashMap");
        System.out.println(storage.map.get("7") + " HashMap");
        System.out.println(storage.map.get("8") + " HashMap");
        System.out.println(storage.map.get("9") + " HashMap");
        System.out.println(storage.map.get("10") + " HashMap");
    }
}
