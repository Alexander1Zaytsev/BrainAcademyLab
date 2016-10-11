package com.brainacad.lab2_15_2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by User on 08/10/2016.
 */
public class Main {

    public static void main(String[] args) {
        List<String> lst = new LinkedList<>();
        int length = 11;
        Random random = new Random();

        for (int i = 0; i < length; i++){
            lst.add("number_" + random.nextInt(i + 1));
        }

        Iterator<String> itr = lst.iterator();
        while (itr.hasNext()) System.out.println(itr.next());
    }
}
