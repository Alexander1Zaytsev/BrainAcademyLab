package com.brainacad.lab3_2_1.lab3_2_2;

import com.brainacad.lab3_2_1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by Alexander on 10/27/2016.
 */
public class DeserializeDemo {

    public static void main(String[] args) {

        Employee employee = new Employee();
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("src\\com\\brainacad\\lab3_2_1\\employee.ser");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            ois = new ObjectInputStream(fis);
            employee = (Employee)ois.readObject();
            System.out.println(employee.getName());
            System.out.println(employee.getAddress());
            System.out.println(employee.getSSN());
            System.out.println(employee.getNumber());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
