package com.brainacad.lab2_1_5;

import com.brainacad.lab2_1_3_lab2_1_4.Computer;

/**
 * Created by Alex on 9/9/2016.
 */
public class Class215 {
    public static void main(String[] args) {
        Computer[] arr = new Computer[3];

        for (int i = 0; i < 3; i++){
            arr[i] = new Computer();
        }

        arr[0].setModel("IBM");
        arr[1].setModel("Apple");
        arr[2].setModel("Asus");

        double price = 3000;
        for (Computer element:arr){
            element.setPrice(price);
            price += 100;
        }

        int hdd = 600;
        for (Computer element: arr){
            element.setHdd(hdd);
            hdd += 200;
        }

        for (Computer element: arr){
            System.out.println(element.getAllFields());
        }
    }
}
