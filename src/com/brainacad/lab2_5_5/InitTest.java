package com.brainacad.lab2_5_5;

/**
 * Created by User on 15/09/2016.
 */
public class InitTest {

    private static int nextId;

    private int id;

    static {
        nextId = (int)(1000 * Math.random());
    }

    public InitTest(){
        nextId++;
        id = nextId;
    }

    public int getId() {
        return id;
    }
}
