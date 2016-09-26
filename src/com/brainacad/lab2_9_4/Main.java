package com.brainacad.lab2_9_4;

import java.util.StringTokenizer;

/**
 * Created by Alex on 9/26/2016.
 */
public class Main {
    public static void main(String[] args) {

        String myStr = "This is String, split by StringTokenizer. Created by Student: Alexander";

        StringTokenizer s1 = new StringTokenizer(myStr);
        StringTokenizer s2 = new StringTokenizer(myStr,",");
        StringTokenizer s3 = new StringTokenizer(myStr,".");

        while (s1.hasMoreElements()){
            System.out.println(s1.nextElement());
        }
        System.out.println("\n");

        while (s2.hasMoreElements()){
            System.out.println(s2.nextElement());
        }
        System.out.println("\n");

        while (s3.hasMoreElements()){
            System.out.println(s3.nextElement());
        }
        System.out.println("\n");

    }
}
