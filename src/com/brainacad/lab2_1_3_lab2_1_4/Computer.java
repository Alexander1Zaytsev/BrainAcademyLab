package com.brainacad.lab2_1_3_lab2_1_4;

/**
 * Created by Alex on 9/9/2016.
 */
public class Computer {
    private String model;
    private int hdd;
    private double price;

    public void setPrice(double price){
        this.price = price;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice(){
        return price;
    }

    public String getAllFields(){
        return ("model of computer: " + model + "; " + "HDD memory: " + hdd + "; " + "Price: " + price);
    }

}
