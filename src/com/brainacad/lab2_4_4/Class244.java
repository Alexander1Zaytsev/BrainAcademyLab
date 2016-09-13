package com.brainacad.lab2_4_4;

/**
 * Created by User on 13/09/2016.
 */
public class Class244 {
    public static void main(String[] args) {

        Employee javaJunior = new Employee();
        Employee secretary = new Employee();
        Employee driver = new Employee();

        javaJunior.setEmployee("Jhon", "Dow", "Java Developer", 982564123);
        secretary.setEmployee("Jessica", "Alba", "secretary", 982554623);
        driver.setEmployee("Frank", "Jhonson", "driver", 982554163);

        System.out.println(Employee.getNumberOfEmployees());
    }
}
