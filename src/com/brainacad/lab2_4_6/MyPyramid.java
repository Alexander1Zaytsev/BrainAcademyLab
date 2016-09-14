package com.brainacad.lab2_4_6;

import java.util.Arrays;

/**
 * Created by Alex on 9/14/2016.
 */
public class MyPyramid {

    public static void printPyramid(int h){

        for (int i = 1; i <= h; i++){

            int lengthOfArray = i * 2 - 1;
            int[] arr = new int[lengthOfArray];
            int k = 2;

            for (int j = 0; j < lengthOfArray; j++){
                if (j < i){
                    arr[j] = j + 1;
                } else {
                    arr[j] = j + 1 - k;
                    k += 2;
                }
            }

            String str = Arrays.toString(arr);
            str = ((str.replace("[", "")).replace(", ", "")).replace("]", "");
            System.out.println(str);
        }
    }
}
