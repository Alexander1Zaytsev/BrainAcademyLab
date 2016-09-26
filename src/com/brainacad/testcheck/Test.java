package com.brainacad.testcheck;



/**
 * Created by User on 06/09/2016.
 */


public class Test {

    public static void main(String[] s) {

       String str = new String("Hello, hello");

        String str2 = new String(str);

        char[] characters = {'H', 'e', 'l', 'l', 'o', '!'};

        String str3 = new String(characters, 1, 3);
        System.out.println(str3);

    }

}


