package com.brainacad.lab2_1_2;

/**
 * Created by User on 08/09/2016.
 */
public class Car {
    private int speed;
    private String driveWheels;
    private int power;

    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setDriveWheels(String driveWheels){
        this.driveWheels = driveWheels;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public int getSpeed(){
        return speed;
    }

    public int getPower() {
        return power;
    }
    public String getDriveWheels(){
        return driveWheels;
    }
}
