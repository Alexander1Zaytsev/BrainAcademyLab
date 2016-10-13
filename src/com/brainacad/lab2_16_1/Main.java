package com.brainacad.lab2_16_1;

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

    public static void main(String[] args) {
        Animal a = new Dog();
        foo(a);
    }
}
