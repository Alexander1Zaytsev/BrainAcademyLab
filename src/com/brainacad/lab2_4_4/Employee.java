package com.brainacad.lab2_4_4;

/**
 * Created by User on 13/09/2016.
 */
public class Employee {

    private static int numberOfEmployees;

    private String firstName;
    private String lastName;
    private String occupation;
    private int telephone;

    public Employee(){
        numberOfEmployees++;
    }

    public static int getNumberOfEmployees(){
        return numberOfEmployees;
    }

    public void setEmployee(String firstName, String lastName, String occupation, int telephone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getTelephone() {
        return telephone;
    }
}
