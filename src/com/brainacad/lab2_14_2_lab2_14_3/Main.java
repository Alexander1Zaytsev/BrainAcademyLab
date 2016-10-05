package com.brainacad.lab2_14_2_lab2_14_3;

import java.util.Random;

/**
 * Created by Alex on 10/5/2016.
 */
public class Main {

    public static void main(String[] args) {

        Integer[] arrInt1 = new Integer[10];
        Integer[] arrInt2 = new Integer[10];
        Double[] arrDouble1 = new Double[10];
        Double[] arrDouble2 = new Double[10];
        int nInt = 3;
        double nDouble = 3.0;
        int sInt = 5;
        double sDouble = 5.0;

        Random random = new Random();

        System.out.print("Array values: ");
        for (int i = 0; i < arrInt1.length; i++) {
            arrInt1[i] = random.nextInt(10);
            System.out.print(arrInt1[i] + ", ");
        }

        System.out.println(" Quantity of elements greater then " + nInt + " equals: " + MyTestMethod.calcNum(arrInt1, nInt));

        System.out.print("Array values: ");
        for (int i = 0; i < arrDouble1.length; i++) {
            arrDouble1[i] = (double) Math.round(Math.random() * 100) / 10;
            System.out.print(arrDouble1[i] + ", ");
        }

        System.out.println(" Quantity of elements greater then " + nDouble + " equals: " + MyTestMethod.calcNum(arrDouble1, nDouble));

        System.out.print("Array values: ");
        for (int i = 0; i < arrInt2.length; i++) {
            arrInt2[i] = random.nextInt(10);
            System.out.print(arrInt2[i] + ", ");
        }

        System.out.println("Sum of elements that are greater then " + sInt + " equals: " + MyTestMethod.calcSum(arrInt2, sInt));

        System.out.print("Array values: ");
        for (int i = 0; i < arrDouble2.length; i++) {
            arrDouble2[i] = (double) Math.round(Math.random() * 100) / 10;
            System.out.print(arrDouble2[i] + ", ");
        }

        System.out.println("Sum of elements that are greater then " + sDouble + " equals:" + MyTestMethod.calcSum(arrDouble2, sDouble));

    }

}
