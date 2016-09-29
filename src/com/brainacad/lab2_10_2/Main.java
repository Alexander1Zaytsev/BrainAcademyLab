package com.brainacad.lab2_10_2;

/**
 * Created by User on 29/09/2016.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(compute((byte)5, 125));

    }

    public static long compute(Byte b, Integer i){
        Long l = (long)(b + i);
        return l;
    }
}
