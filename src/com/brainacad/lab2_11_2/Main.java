package com.brainacad.lab2_11_2;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Alex on 9/29/2016.
 */
public class Main {
    public static void main(String[] args) {

        try{
            throw new MyException("MyException Test");
        } catch (MyException e){
            e.print();
        } finally {
            System.out.println("Finally");
        }

        System.out.println("\n");

        try{
            MyTest.test();
        } catch (MyException e){
            e.print();
        } finally {
            System.out.println("Finally2");
        }

    }
}
