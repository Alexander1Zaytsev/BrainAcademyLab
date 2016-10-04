package com.brainacad.lab2_12_5;

/**
 * Created by Alex on 10/4/2016.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println(MyTestClass.MyStaticNested.str);

        MyTestClass myTestClass = new MyTestClass();
        System.out.println(myTestClass.myInner.str);

        System.out.println(myTestClass.local());

        MyTestClass.MyStaticNested myStaticNested = new MyTestClass.MyStaticNested();
        myStaticNested.print();

        MyTestClass.MyInner innerObject = myTestClass.new MyInner();
        innerObject.print();


    }
}
