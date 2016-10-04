package com.brainacad.lab2_12_5;

/**
 * Created by Alex on 10/3/2016.
 */
public class MyTestClass {

    static String strTest = "MyTest class";

    public void test(){
        System.out.println("Method test");
    }

    public static class MyStaticNested{
        static String str = "MyStaticNested Class";
        void print(){
            System.out.println(strTest);
        }
    }
    MyStaticNested myStaticNested = new MyStaticNested();

    class MyInner{
        String str = "MyInner class";
        void print(){
            System.out.println(strTest);
        }
    }
    MyInner myInner = new MyInner();

    public String local(){
        class MyLocal{
            String str = "Local class";
        }
        MyLocal myLocal = new MyLocal();
        return myLocal.str;
    }
}
