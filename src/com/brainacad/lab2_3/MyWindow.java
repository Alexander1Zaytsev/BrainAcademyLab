package com.brainacad.lab2_3;

/**
 * Created by Alex on 9/12/2016.
 */
public class MyWindow {
    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen){
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public MyWindow(){
        this.width = 2.0;
        this.height = 1.5;
        this.numberOfGlass = 6;
        this.color = "white";
        this.isOpen = true;
    }

    /*public  MyWindow(double width, double height){   //Lab work 2-3-3
        this.width = width;
        this.height = height;
    }*/

    public MyWindow(double width, double height){
        this(width, height, 4, "brown", false);
    }


    /*public  MyWindow(double width, double height, int numberOfGlass){ Lab work 2-3-3
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
    }*/

    public MyWindow(double width, double height, int numberOfGlass) {
        this(width, height, numberOfGlass, "white", true);
    }

    public void printField(){
        System.out.println("window width: " + this.width+ " window height: " + this.height+ " number of glasses: " + this.numberOfGlass + " color: " + this.color + "window is open" + this.isOpen);
    }



}
