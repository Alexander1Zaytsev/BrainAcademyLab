package com.brainacad.lab2_16_4;

import com.brainacad.lab2_16_1.*;

/**
 * Created by User on 13/10/2016.
 */
public class Main {

    static void foo(Animal a){
        System.out.println("Animal");
    }

    static void foo(Dog d){
        System.out.println("Dog");
    }

    static void foo(Puppy p){
        System.out.println("Puppy");
    }

    public static void main(String[] args) {
        foo(null);
    }
}
