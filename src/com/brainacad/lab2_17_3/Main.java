package com.brainacad.lab2_17_3;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Alexander on 10/18/2016.
 */
public class Main {

    public static void main(String[] args) {

        int[] myArray = new int[1000];
        Random rnd = new Random();
        int startIndex = 0;

        MySumCount mySumCount1 = new MySumCount();
        MySumCount mySumCount2 = new MySumCount();


        for (int i = 0; i < myArray.length; i++){
            myArray[i] = rnd.nextInt(1001);
        }

        mySumCount1.setStartIndex(startIndex);
        mySumCount1.setStopIndex(myArray.length - 1);
        mySumCount1.setArr(myArray);

        mySumCount2.setStartIndex(startIndex);
        mySumCount2.setStopIndex(myArray.length - 1);
        mySumCount2.setArr(myArray);

        System.out.println(Arrays.toString(myArray));

        mySumCount1.start();
        mySumCount2.start();

        try {
            mySumCount1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            mySumCount2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread 1 result:" + mySumCount1.getResultSum());
        System.out.println("Thread 2 result:" + mySumCount2.getResultSum());
    }
}
