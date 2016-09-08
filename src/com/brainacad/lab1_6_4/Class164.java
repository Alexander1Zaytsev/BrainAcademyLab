package com.brainacad.lab1_6_4;
import java.util.Arrays;

/**
 * Created by Alex on 9/8/2016.
 */
public class Class164 {
    public static void main(String[] args) {
        int[] arr = {2,5,4,65,95,1,2,0,25,36,45,68,4,5,9,8,7};
        Arrays.sort(arr);
        int searchValue = 256;
        int posVal;
        System.out.println(Arrays.toString(arr));
        System.out.println("Position of searched value in sort array is: " + Arrays.binarySearch(arr, searchValue));
    }

}
