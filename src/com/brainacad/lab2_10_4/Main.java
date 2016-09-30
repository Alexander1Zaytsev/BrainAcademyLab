package com.brainacad.lab2_10_4;

import com.brainacad.lab2_8.*;

/**
 * Created by Alex on 9/30/2016.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(Shape.parseShape1("Rectangle:RED:10,20"));
        System.out.println(Shape.parseShape1("Circle:BLACK:10"));
        System.out.println(Shape.parseShape1("Triangle:GREEN:9,7,12"));
    }
}
