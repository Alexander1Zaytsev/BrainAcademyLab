package com.brainacad.lab2_11_2;

/**
 * Created by Alex on 9/29/2016.
 */
public class MyException extends Exception {
    protected String reference;

    MyException(String reference){
        this.reference = reference;
    }

    public void print(){
        System.out.println(reference);
    }
}
