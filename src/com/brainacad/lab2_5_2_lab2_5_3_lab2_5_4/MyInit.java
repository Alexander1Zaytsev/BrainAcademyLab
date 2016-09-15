package com.brainacad.lab2_5_2_lab2_5_3_lab2_5_4;

/**
 * Created by User on 15/09/2016.
 */
public class MyInit {

    //private int[] arr;                 // Lab 2-5-2 non-static field
    private static int[] arr;            // Lab 2-5-3 With static field

    /*{                                                   // Lab 2-5-2 - Lab 2-5-3 non-static block
        arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (100 * Math.random());
        }
    }*/

    static {                                                   // Lab 2-5-4 - Lab 2-5-4 static block
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (100 * Math.random());
        }
    }

    public void printArray(){
       for(int element:arr){
           System.out.print(element + ",");
       }
    }

}
