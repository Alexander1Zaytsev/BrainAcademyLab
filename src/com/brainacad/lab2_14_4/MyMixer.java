package com.brainacad.lab2_14_4;

import java.util.Random;

/**
 * Created by Alex on 10/5/2016.
 */
public class MyMixer<T> {

    T[] arr;

    public MyMixer(T[] arr) {
        this.arr = arr;
    }

    public T[] shuffle() {
        T a;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int position = random.nextInt(i + 1);
            a = arr[i];
            arr[i] = arr[position];
            arr[position] = a;
        }
        return arr;
    }
}
