package com.brainacad.lab2_1_2;

/**
 * Created by User on 08/09/2016.
 */
public class Class212 {
    public static void main(String[] args) {
        Car bmw = new Car();
        Car hundai = new Car();

        bmw.setDriveWheels("Rear");
        bmw.setSpeed(200);
        bmw.setPower(180);
        hundai.setDriveWheels("Front");
        hundai.setSpeed(150);
        hundai.setPower(120);
        System.out.println("BMW drive wheels:" + bmw.getDriveWheels());
        System.out.println("BMW speed: " + bmw.getSpeed());
        System.out.println("BMW power: " + bmw.getPower());
    }

}
