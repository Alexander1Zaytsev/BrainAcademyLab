package com.brainacad.lab1_5_2;
import java.util.Scanner;

/**
 * Created by Alex on 9/4/2016.
 */
public class SecondClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input value of X");
        int x = sc.nextInt();
        String str = "";
        if (x <= 9) {
            switch (x){
                case 1:
                    str = "One";
                    break;
                case 2:
                    str = "Two";
                    break;
                case 3:
                    str = "Three";
                    break;
                case 4:
                    str = "Four";
                    break;
                case 5:
                    str = "Five";
                    break;
                case 6:
                    str = "Six";
                    break;
                case 7:
                    str = "Seven";
                    break;
                case 8:
                    str = "Eight";
                    break;
                case 9:
                    str = "Nine";
                    break;
            }
        } else {
            str = "Other";
        }
        System.out.println(str);
    }
}
