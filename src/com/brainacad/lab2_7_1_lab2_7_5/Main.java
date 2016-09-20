package com.brainacad.lab2_7_1_lab2_7_5;

/**
 * Created by Alex on 9/20/2016.
 */
public class Main {

    public static void main(String[] args) {

        Device[] arrOfDevices = new Device[2];
        Monitor[] arrOfMonitors = new Monitor[2];
        EthernetAdapter[] arrOfAdapters = new EthernetAdapter[2];

        for (int i = 0; i < 2; i++){
            arrOfDevices[i] = new Device();
            arrOfMonitors[i] = new Monitor();
            arrOfAdapters[i] = new EthernetAdapter();

            arrOfDevices[i].setManufacturer("Microsoft");
            arrOfDevices[i].setPrice(150);
            arrOfDevices[i].setSerialNumber("12345QWERTY");

            arrOfMonitors[i].setManufacturer("Samsung");
            arrOfMonitors[i].setPrice(120);
            arrOfMonitors[i].setSerialNumber("AB1234567CD");
            arrOfMonitors[i].setResolutionX(1280);
            arrOfMonitors[i].setResolutionY(1024);

            arrOfAdapters[i].setManufacturer("Apple");
            arrOfAdapters[i].setPrice(80);
            arrOfAdapters[i].setSerialNumber("CD654321AB");
            arrOfAdapters[i].setSpeed(100);
            arrOfAdapters[i].setMac("00:00:00:a1:2b:cc");
        }

        arrOfMonitors[1].manufacturer = "LG";             //Changed manufacturer


        for (int i = 0; i < 2; i++){
            System.out.println(arrOfDevices[i]);
        }

        for (int i = 0; i < 2; i++){
            System.out.println(arrOfMonitors[i]);
        }

        for (int i = 0; i < 2; i++){
            System.out.println(arrOfAdapters[i]);
        }

        System.out.println("\n");

        System.out.println("Equality of the devices: " + arrOfDevices[0].equals(arrOfDevices[1]));
        System.out.println("Equality of the monitors: " + arrOfMonitors[0].equals(arrOfMonitors[1]));
        System.out.println("Equality of the ethernet adapters: " + arrOfAdapters[0].equals(arrOfAdapters[1]));
        System.out.println("\n");

        System.out.println("hash code of device 1: " + arrOfDevices[0].hashCode());
        System.out.println("hash code of device 2: " + arrOfDevices[1].hashCode());

        System.out.println("hash code of monitor 1: " + arrOfMonitors[0].hashCode());
        System.out.println("hash code of monitor 2: " + arrOfMonitors[1].hashCode());

        System.out.println("hash code of ethernet adapter 1: " + arrOfAdapters[0].hashCode());
        System.out.println("hash code of ethernet adapter 2: " + arrOfAdapters[1].hashCode());


    }
}
