package com.brainacad.lab2_10_3;

import com.brainacad.lab2_8.InvalidShapeStringException;
import com.brainacad.lab2_8.Shape;

/**
 * Created by Alex on 9/30/2016.
 */
public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(Shape.parseShape("Rectangle:RED:10,20"));
            System.out.println(Shape.parseShape("Triangle:GREEN:9,7,12"));
            System.out.println(Shape.parseShape("Circle:BLACK:10"));
        }catch (InvalidShapeStringException e){
            e.printStackTrace();
        }
    }
}
