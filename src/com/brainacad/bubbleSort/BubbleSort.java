package com.brainacad.bubbleSort;

import java.util.Arrays;

/**
 * Created by Alex on 9/7/2016.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int x[] = {2,4,56,3,23,45,98,0,76,5,44,3,3};
        System.out.println(Arrays.toString(x));
        sortBubble(x);
        System.out.println("Sort array is: \n" + Arrays.toString(x));
    }

    public static void sortBubble(int a[]){
        int temp;
        for (int i = 0; i < a.length - 1; i++){
            for (int j = 0; j < a.length - i -1; j++){
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
