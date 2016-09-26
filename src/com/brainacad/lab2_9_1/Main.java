package com.brainacad.lab2_9_1;

/**
 * Created by Alex on 9/26/2016.
 */
public class Main {

    public static String reverseString(String str){

        StringBuilder sb = new StringBuilder(str);
        return (sb.reverse()).toString();
    }

    public static void main(String[] args) {

        String myStr = "abracadabra";

        System.out.println(myStr.indexOf("ra"));
        System.out.println(myStr.lastIndexOf("ra"));
        System.out.println(myStr.substring(3,7));
        System.out.println(reverseString(myStr));
    }
}
