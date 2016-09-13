package com.brainacad.lab2_4_2;

/**
 * Created by User on 13/09/2016.
 */
public class Class242 {
    public static void main(String[] args) {
        Calculation A = new Calculation();

        int[] arr1 = {10, 12, 1, 5};
        int[] arr2 = {8, 158, 4, 152, 0};

        A.setArr1(arr1);
        A.setArr2(arr2);

        int min = A.getMinFirstArray();
        int max = A.getMaxSecondArray();

        System.out.println(min);
        System.out.println(max);
    }
}
