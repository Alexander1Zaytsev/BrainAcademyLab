package com.brainacad.lab1_6_1;
import java.util.Arrays;

/**
 * Created by Alex on 9/8/2016.
 */
public class Class161 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        int j = 2;
        for (int i = 0; i < 15; i++){
           arr[i] = j;
            j+=2;
           }
        System.out.println(Arrays.toString(arr));
    }
}
