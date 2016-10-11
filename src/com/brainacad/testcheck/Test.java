

package com.brainacad.testcheck;




/**
 * Created by User on 06/09/2016.
 */



import java.util.*;
class Test {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        List list = intList;
        list.add("hello");
        for (Object o : list) {
            System.out.print(o + " ");
        }
    }
}