package com.brainacad.lab2_14_4;

/**
 * Created by Alex on 10/5/2016.
 */
public class Main {

    public static void main(String[] args) {

        Integer[] arrInt = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] arrStr = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        MyMixer<Integer> myMixer1 = new MyMixer<>(arrInt);
        myMixer1.shuffle();
        System.out.print("Mixed array: ");
        for (Integer element : arrInt) {
            System.out.print(element + ",");
        }
        System.out.println("\n");

        MyMixer<String> myMixer2 = new MyMixer<>(arrStr);
        myMixer2.shuffle();
        System.out.print("Mixed array: ");
        for (String element : arrStr) {
            System.out.print(element + ",");
        }

    }
}
