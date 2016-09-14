package com.brainacad.lab2_4_4;

/**
 * Created by User on 13/09/2016.
 */
public class Class244 {

    public static void main(String[] args) {

        Employee javaJunior = new Employee("John", "Dow", "Java Developer", 982564123);
        Employee secretary = new Employee("Jessica", "Roberts", "secretary", 982554623);
        Employee driver = new Employee("Frank", "Johnson", "driver", 982554163);


        System.out.println("Number of employees: " + Employee.getNumberOfEmployees());
    }
}
