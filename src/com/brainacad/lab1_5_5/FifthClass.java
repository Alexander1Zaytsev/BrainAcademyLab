package com.brainacad.lab1_5_5;
import java.util.Scanner;
/**
 * Created by Alex on 9/4/2016.
 */
public class FifthClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an upper bound");
        int n = sc.nextInt();
        int i;
        int sum = 0;
        for (i = 1; i<= n; i++){
            sum = sum + i;
        }
        float average = (float)sum/n;
        System.out.println("Sum equals: " + sum);
        System.out.println("Average equals: " + average);
    }
}
