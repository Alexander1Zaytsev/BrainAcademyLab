package com.brainacad.lab2_14_2;

import java.util.Comparator;

/**
 * Created by User on 04/10/2016.
 */
public class MyTestMethod <T> implements Comparable {

    T element;


    @Override
    public int compareTo(Object o){


        return this.element - (<T>)o.element;
    }

    static <T extends Number> int calcNum(T[] arr, T maxelm) {



        int count = 0;
        for (T element : arr) {
            if (element.) {
                count++;
            }
        }
        return count;
    }

}
