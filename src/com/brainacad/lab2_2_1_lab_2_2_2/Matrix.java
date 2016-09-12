package com.brainacad.lab2_2_1_lab_2_2_2;

/**
 * Created by User on 10/09/2016.
 */
public class Matrix {
    public int[][] arr = new int[2][2];

    public void setArr(int[][] arr) {
        this.arr = arr;
    }

    public int[][] addArrays(int[][] arr2){
        int[][] result = new int[2][2];
        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2[i].length; j++){
                result[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        return result;
    }

    public int[][] multiplyArrays(int[][] arr2){
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                for (int k = 0; k < 2; k++){
                    result[i][j] += arr[i][k] * arr2[k][j];
                }
            }
        }
        return result;
    }

}
