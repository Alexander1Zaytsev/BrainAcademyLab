package com.brainacad.lab2_15_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
}
