package com.brainacad.lab2_11_4;

import com.brainacad.lab2_8.InvalidShapeStringException;
import com.brainacad.lab2_8.Shape;

import java.util.Scanner;

/**
 * Created by Alex on 9/30/2016.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input parameters of the shape");

        try{
            System.out.println(Shape.parseShape(sc.nextLine()));
        } catch (InvalidShapeStringException e) {
            e.printStackTrace();
        }
    }
}
