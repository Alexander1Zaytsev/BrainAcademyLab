package com.brainacad.lab2_11_5;

/**
 * Created by Alex on 9/30/2016.
 */
public class Main1 {
    public static void main(String[] args) {

        long l = 5L;
        float f = 5.2f;
        double d = l + f;

        assert compute(5L,5.2f)== d;

    }

    public static Double compute(Long l, Float f){
        return (double)(l + f);
    }
}
