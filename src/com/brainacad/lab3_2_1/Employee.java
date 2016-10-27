package com.brainacad.lab3_2_1;

import java.io.Serializable;

/**
 * Created by Alexander on 10/27/2016.
 */
public class Employee implements Serializable {

    private String name;
    private String address;
    private transient int SSN;
    private int number;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getSSN() {
        return SSN;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString(){
        return name + " " + address + " " + SSN + " " + number;
    }
}
