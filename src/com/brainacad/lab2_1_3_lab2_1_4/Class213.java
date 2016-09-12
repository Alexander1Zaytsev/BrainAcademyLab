package com.brainacad.lab2_1_3_lab2_1_4;

/**
 * Created by User on 08/09/2016.
 */
public class Class213 {
    public static void main(String[] args) {
        Computer[] arr = new Computer[5];


        /*for (Computer element: arr){ // does not working - mistake in line 21
            element = new Computer();
        }*/

        for (int i = 0; i < 5; i++){
            arr[i] = new Computer();
        }

        double k = 12.50;
        for (Computer element: arr){                        //form prices
            element.setPrice(k);
            k+=2;
            System.out.println(element.getPrice());
        }

        /* for (int i = 0; i < 5; i++){
             arr[i].setPrice(k);
             k+=2;
             System.out.println(arr[i].getPrice());
         }*/

        System.out.println("Increasing prices is");
        for (Computer element:arr){                              //increase and print price
            element.setPrice(Math.round(1.1 * element.getPrice()*100.0)/100.0);
            System.out.println(element.getPrice());
        }

    }


}

