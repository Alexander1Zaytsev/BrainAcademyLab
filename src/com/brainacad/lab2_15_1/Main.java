package com.brainacad.lab2_15_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by User on 08/10/2016.
 */
public class Main {

    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        int lengthOfList = 11;

        for (int i = 0; i < lengthOfList; i++){
            Random random = new Random();
            lst.add("number_" + random.nextInt(i + 1));
        }

        Iterator<String> itr = lst.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
