package com.brainacad.testcheck;

import java.util.Arrays;

/**
 * Created by User on 06/09/2016.
 */
public class Test {
    public static void main(String [] args){

        int[] arr = new int[5];
        for (int element: arr){
            element = 1;
        }

        System.out.println(Arrays.toString(arr));

        int i = 9 / 2;
        System.out.println(i);

       

    }

}

