package com.brainacad.lab1_5_4;

/**
 * Created by Alex on 9/4/2016.
 */
public class FourthClass {
    public static void main(String[] args) {
        int i;
        int count = 0;
        for (i = 1; i <= 300; i++){
            if ((i%3 == 0) && (i%4 == 0)){
                System.out.println(i);
                count++;
                if (count > 9) {
                    break;
                }
            }
        }
    }

}
