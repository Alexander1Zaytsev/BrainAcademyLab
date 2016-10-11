package com.brainacad.lab2_15_4;

import java.util.*;

/**
 * Created by Alexander on 10/11/2016.
 */
public class MyNumGenerator {

    private int numOfElem;
    private int maxNumb;

    public MyNumGenerator(int numOfElem, int maxNumb) {
        this.numOfElem = numOfElem;
        this.maxNumb = maxNumb;
    }

    public List generate(){
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < numOfElem; i++){
            list.add(random.nextInt(maxNumb + 1));
        }
        return list;
    }

    public Set<Integer> generateDistinct(){
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        set.add(random.nextInt(maxNumb + 1));
        for (int i = 1; i < numOfElem; i++){
            while (set.size() < i + 1) set.add(random.nextInt(maxNumb + 1));
        }
        return set;
    }
}
