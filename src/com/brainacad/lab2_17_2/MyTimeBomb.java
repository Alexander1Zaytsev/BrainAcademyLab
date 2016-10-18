package com.brainacad.lab2_17_2;

/**
 * Created by Alexander on 10/18/2016.
 */
public class MyTimeBomb implements Runnable {

    @Override
    public void run(){
        for (int i = 10; i >= 0; i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("BOOM!");
    }
}
