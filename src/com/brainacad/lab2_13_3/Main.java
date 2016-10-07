package com.brainacad.lab2_13_3;

import com.brainacad.lab2_13_1.MyDayOfWeek;

import java.util.Scanner;

/**
 * Created by User on 06/10/2016.
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a day of a week(in upper case)");

        System.out.println("The next day of week is: " + MyDayOfWeek.valueOf(sc.nextLine()).next());

    }
}
