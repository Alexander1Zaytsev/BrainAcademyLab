package com.brainacad.lab2_11_2;

/**
 * Created by Alex on 9/29/2016.
 */
public class MyTest {

    public static void test() throws MyException{
        throw new MyException("Throwing MyException through test method in MyTest class");
    }

    Object myTest;
}
