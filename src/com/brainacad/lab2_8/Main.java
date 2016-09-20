package com.brainacad.lab2_8;

import java.util.Arrays;

/**
 * Created by Alex on 9/20/2016.
 */
public class Main {

    public static void main(String[] args) {

        Shape[] arr = new Shape[9];
        for (int i = 0; i < arr.length; i++){
            if (i < 5) {
                arr[i] = new Rectangle("RED", 5 + i, 5 + i);
            }
            if ((i >= 5) && (i < 7)) {
                arr[i] = new Circle("BLACK", 5 + i);
            }
            if (i > 6) {
                arr[i] = new Triangle("GREEN", 5 + i, 5 + i, 5 + i);
            }
        }

        for (Shape element: arr){
            element.draw();
        }
        System.out.println("\n");


        System.out.println(((Rectangle)arr[0]).compareTo(arr[1])); // Compare first rectangle and second rectangle in array by area
        System.out.println("\n");



        Rectangle[] arr2 = new Rectangle[6];      //New array of rectangles override methods and sort it
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = new Rectangle("Orange", 10 - i, 11 + i);
        }

        Arrays.sort(arr2, new RectangleAreaComparator());
        for (Rectangle element:arr2){
            element.draw();
        }

    }

}
