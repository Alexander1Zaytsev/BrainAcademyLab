package com.brainacad.lab2_4_2;


import com.brainacad.lab2_4_1_lab2_4_3.MyMath;

/**
 * Created by User on 13/09/2016.
 */
public class Calculation {
    public int[] arr1;
    public int[] arr2;

    public void setArr1(int[] arr1) {
        this.arr1 = arr1;
    }

    public void setArr2(int[] arr2) {
        this.arr2 = arr2;
    }

    public int getMinFirstArray(){
        int min = MyMath.findMin(arr1);
        return min;
    }

    public int getMaxSecondArray() {
        int max = MyMath.findMax(arr2);
        return max;
    }
}
