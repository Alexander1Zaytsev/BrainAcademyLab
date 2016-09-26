package com.brainacad.lab2_9_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Alex on 9/26/2016.
 */
public class Main {

    public static boolean checkPersonWithRegExp(String userNameString){
        String emlpat = "^[A-Z]{1}[a-z]*";
        Pattern pat = Pattern.compile(emlpat);
        Matcher m = pat.matcher(userNameString);
        return m.matches();
    }

    public static void main(String[] args) {

        System.out.println("VOVA " + checkPersonWithRegExp("VOVA"));
        System.out.println("Ivan " + checkPersonWithRegExp("Ivan"));
        System.out.println("R2d2 " + checkPersonWithRegExp("R2d2"));
        System.out.println("ZX " + checkPersonWithRegExp("ZX"));
        System.out.println("Anna " + checkPersonWithRegExp("Anna"));
        System.out.println("12345 " + checkPersonWithRegExp("12345"));
        System.out.println("ToAd " + checkPersonWithRegExp("ToAd"));
        System.out.println("TomCat " + checkPersonWithRegExp("TomCat"));
        System.out.println("" + checkPersonWithRegExp(""));


    }
}
