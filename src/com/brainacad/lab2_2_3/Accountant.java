package com.brainacad.lab2_2_3;

/**
 * Created by Alex on 9/11/2016.
 */
public class Accountant {
    public static void main(String[] args) {
        Employee[] arr = new Employee[4];
        String[] name = {"Ivanov", "Petrenko", "Jhonson", "Melnichuk"};

        double k = 25.21;
        for (int i = 0; i < 2; i++) {
            arr[i] = new Employee();
            arr[i].calcSalary(name[i] ,5832.12 + k, 6598.23 + k, 4563.22 + k, 5689.00 + k);
            k += 24.41;
        }
        for (int i = 2; i < 4; i++) {
            arr[i] = new Employee();
            arr[i].calcSalary(name[i], 5832.12 + k, 5689.00 + k);
            k += 24.42;
        }
    }
}
