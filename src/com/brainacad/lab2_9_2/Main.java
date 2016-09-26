package com.brainacad.lab2_9_2;

/**
 * Created by Alex on 9/26/2016.
 */
public class Main {

    public static void main(String[] args) {

        String myStr1 = "Cartoon", myStr2 = "Tomcat";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < myStr1.length(); i++){
            if (myStr2.indexOf(myStr1.charAt(i)) == -1) sb.append(myStr1.charAt(i));
        }

        System.out.println(sb);
    }
}
