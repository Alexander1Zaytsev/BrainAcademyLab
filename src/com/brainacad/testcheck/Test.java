/* hklsdgflsdgf*/

package com.brainacad.testcheck;


import java.util.DoubleSummaryStatistics;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 06/09/2016.
 */


public class Test {

    public static void main(String[] s) {

        String str = "Triangle:GREEN:9,7,12";
        String emplat = "(^\\w+):(\\w+):(\\d+)((.\\d+)*)((\\d+)((.\\d+)*))*";
        Pattern pat = Pattern.compile(emplat);
        Matcher m = pat.matcher(str);
        System.out.println(m.matches());


    }

}


