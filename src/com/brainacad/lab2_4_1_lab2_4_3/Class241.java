package com.brainacad.lab2_4_1_lab2_4_3;

/**
 * Created by User on 13/09/2016.
 */
public class Class241 {

    public static void main(String[] args) {

        int[] arr = {2,5,10,1,0,8};

        int min = MyMath.findMin(arr);
        int max = MyMath.findMax(arr);

        System.out.println("Min of array: " + min);
        System.out.println("Max of array: " + max);

        System.out.println("Square of circle: " + MyMath.areaOfCircle(5)); // Lab 2-4-3
    }
}
