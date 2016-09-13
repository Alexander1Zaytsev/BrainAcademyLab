package com.brainacad.lab2_4_1_lab2_4_3;

/**
 * Created by User on 13/09/2016.
 */
public class MyMath {

    public static final double PI = 3.14;

    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double areaOfCircle(int r){ //Lab work 2-4-3
        return PI * r * r;
    }

}
