package com.brainacad.lab2_13_2;

import com.brainacad.lab2_13_1.MyDayOfWeek;

/**
 * Created by User on 06/10/2016.
 */
public class Main {

    public static void main(String[] args) {

        for (MyDayOfWeek day : MyDayOfWeek.values()) {
            switch (day) {
                case TUSDAY:
                    System.out.println("My JAVA day:" + day);
                    break;
                case THURSDEY:
                    System.out.println("My JAVA day:" + day);
                    break;
                case SATURDAY:
                    System.out.println("My JAVA day:" + day);
                    break;
            }
        }

    }
}
