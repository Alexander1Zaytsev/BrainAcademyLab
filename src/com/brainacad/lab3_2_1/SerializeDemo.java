package com.brainacad.lab3_2_1;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Alexander on 10/27/2016.
 */
public class SerializeDemo {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("Vladimir");
        employee.setAddress("Holosiivska street");
        employee.setSSN(5264);
        employee.setNumber(675892354);

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("src\\com\\brainacad\\lab3_2_1\\employee.ser");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            oos = new ObjectOutputStream(fos);
            oos.writeObject(employee);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
