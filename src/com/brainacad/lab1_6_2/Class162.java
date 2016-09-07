package com.brainacad.lab1_6_2;
import java.util.Arrays;

/**
 * Created by Alex on 9/8/2016.
 */
public class Class162 {
    public static void main(String[] args) {
        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        Arrays.sort(m);
        int min = m[0];

        int max = m[m.length-1];

        double average;
        int sum = 0;
        for(int element:m){
            sum = sum + element;
        }
        average = (double)sum/m.length;

        double median;
        if (m.length%2 == 0){
            median = (m[m.length/2] + m[m.length/2-1])/2;
        } else {
            median = m[(m.length-1)/2];
        }
        System.out.println(Arrays.toString(m));
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("average: " + average);
        System.out.println("median: " + median);

    }
}
