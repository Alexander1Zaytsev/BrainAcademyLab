package com.brainacad.lab1_6_3;

import java.util.Arrays;

/**
 * Created by Alex on 9/8/2016.
 */
public class Class163 {
    public static void main(String[] args) {
        int arr[][] = new int[4][4];
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = j + 1 + count;
            }
            count = count + 4;
        }
      /*  for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.println(arr[i][j]);
            }
        }*/
        for (int j = 0; j < 4; j++){
            for (int i = 0; i < 4; i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
