package com.brainacad.lab1_5_1;

/**
 * Created by Alex on 9/4/2016.
 */
public class FirstClass {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <=8; i++){
            int x = i;
            while (x > 0){
                if (x == 1){
                    System.out.println(x);
                } else {
                    System.out.print(x);
                }
                x--;
            }
        }
    }
}
