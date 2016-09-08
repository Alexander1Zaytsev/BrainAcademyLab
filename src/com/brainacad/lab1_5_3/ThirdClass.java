package com.brainacad.lab1_5_3;

/**
 * Created by Alex on 9/4/2016.
 */
public class ThirdClass {
    public static void main(String[] args) {
        System.out.println("* | 1 2 3 4 5 6 7 8 9");
        System.out.println("----------------------");
        int i, j;
        for (i = 1; i <= 9; i++){
            System.out.print(i + " | ");
            for (j = 1; j <= 9; j++){
                if (j < 9){
                    System.out.print(i * j + " ");
                } else {
                    System.out.println(i * j);
                }
            }
        }
    }
}
