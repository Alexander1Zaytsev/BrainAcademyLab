package com.brainacad.lab2_13_2;

import com.brainacad.lab2_13_1.MyDayOfWeek;

/**
 * Created by User on 06/10/2016.
 */
public class Main {

    public static final String MY_JAVA_DAY = "My JAVA day:";

    public static void main(String[] args) {

        for (MyDayOfWeek day : MyDayOfWeek.values()) {
            switch (day) {
                case TUESDAY:
                    print(day);
                    break;
                case THURSDAY:
                    print(day);
                    break;
                case SATURDAY:
                    print(day);
                    break;
            }
        }

    }

    private static void print(MyDayOfWeek day) {
        System.out.println(MY_JAVA_DAY + day);
    }
}
