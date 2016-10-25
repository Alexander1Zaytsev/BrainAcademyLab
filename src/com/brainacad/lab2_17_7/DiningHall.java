package com.brainacad.lab2_17_7;

/**
 * Created by Alexander on 10/24/2016.
 */
public class DiningHall {

    static int pizzaNum;
    static int studentID;

    public void makePizza(){
        pizzaNum++;
    }

    public synchronized void servePizza(){
        String result;
        if (pizzaNum > 0) {
            result = "Served";
            pizzaNum--;
        } else {
            result = "Starved";
        }
        System.out.println(result + " " + studentID);
        studentID++;
    }

    public static void main(String[] args) {

        final DiningHall d = new DiningHall();

        for (int i = 0; i < 10; i++){
            d.makePizza();
        }

        for (int i = 0; i < 20; i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    d.servePizza();
                }
            });
            thread.start();
        }
    }
}
