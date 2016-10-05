package com.brainacad.lab2_14_2_lab2_14_3;

/**
 * Created by User on 04/10/2016.
 */
public class MyTestMethod {

    static <T extends Number & Comparable<T>> int calcNum(T[] arr, T maxelm) {
        int count = 0;
        for (T element : arr) {
            if (element.compareTo(maxelm) > 0) {
                count++;
            }
        }
        return count;
    }

    static <T extends Number & Comparable<T>> double calcSum(T[] arr, T maxval) {
        double sum = 0.0;
        for (T element : arr) {
            if (element.compareTo(maxval) > 0) {
                sum += element.doubleValue();
            }
        }
        return sum;
    }

}
