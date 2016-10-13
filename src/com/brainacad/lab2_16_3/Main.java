package com.brainacad.lab2_16_3;

/**
 * Created by User on 13/10/2016.
 */
public class Main {

    static void foo(int a, int b){
        System.out.println("a = " + a + " b = " + b);
    }

    static void foo(int...a){
        System.out.print("Array content: ");
        for(int element:a){
            System.out.print(element + ", ");
        }
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        foo(a,b);
        foo(a,b,c);
    }
}
