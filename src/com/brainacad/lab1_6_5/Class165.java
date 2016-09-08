package com.brainacad.lab1_6_5;

/**
 * Created by Alex on 9/8/2016.
 */
public class Class165 {
    public static void main(String[] args) {
        int arr[][] = {{1,1,1,3,4},{2,1,3,1,2},{2,1,3,4,1},{3,3,3,0,4}};
        int searchElement = 1;
        for (int i = 0; i < arr.length; i++){
            String str = "";
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] == searchElement) {
                    str = str + Integer.toString(j+1) + ",";
                }
            }
            if (!(str.length() == 0))
             {str = str.substring(0, str.length()-1);
             }
            System.out.print("Line " + (i+1) + ": " + str);
            System.out.println("\n");
        }
    }
}
