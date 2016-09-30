package com.brainacad.lab2_10_5;

import com.brainacad.lab2_8.Shape;

import java.util.Scanner;

/**
 * Created by Alex on 9/30/2016.
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input length of array of Shapes");
        int length = Integer.parseInt(sc.nextLine());

        System.out.println("Input your shapes, for example: Rectangle:RED:11,22");
        Shape[] shapes = new Shape[length];
        for (int i = 0; i < length; i++){
            shapes[i] = Shape.parseShape1(sc.nextLine());
        }

        System.out.println("\n Result is: \n");
        for (int i = 0; i < shapes.length; i++){
            System.out.println(shapes[i] + ", area is " + shapes[i].calcArea());
        }
    }
}
