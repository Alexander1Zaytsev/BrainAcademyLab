package com.brainacad.lab2_2_1_lab_2_2_2;

/**
 * Created by User on 10/09/2016.
 */
public class Class221 {
    public static void main(String[] args) {
        Matrix arr = new Matrix();
        int[][] firstArray = {{1,2},{3,4}};
        arr.setArr(firstArray);

        int[][] operationalArray = {{4,3},{2,1}};

        printArray(arr.addArrays(operationalArray));

        printArray(arr.multiplyArrays(operationalArray));

    }


    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
    }
}
