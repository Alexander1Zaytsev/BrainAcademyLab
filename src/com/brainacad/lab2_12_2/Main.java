package com.brainacad.lab2_12_2;

import com.brainacad.lab2_12_1.MyPhoneBook;

/**
 * Created by Alex on 10/3/2016.
 */
public class Main {

    public static void main(String[] args) {

     MyPhoneBook myPhoneBook = new MyPhoneBook();

        myPhoneBook.addPhoneNumber("Vova", "523654136");
        myPhoneBook.addPhoneNumber("Vasya", "253654137");
        myPhoneBook.addPhoneNumber("Petya", "633654138");
        myPhoneBook.addPhoneNumber("John", "163654139");
        myPhoneBook.addPhoneNumber("Nick", "193654130");
        myPhoneBook.addPhoneNumber("George", "535541360");
        myPhoneBook.addPhoneNumber("Konstantyn", "153654137");
        myPhoneBook.addPhoneNumber("Ivan", "633655238");
        myPhoneBook.addPhoneNumber("Debby", "163668439");
        myPhoneBook.addPhoneNumber("Irina", "936458130");

        myPhoneBook.sortByName();
        myPhoneBook.printPhoneBook();
        System.out.println("\n");

        myPhoneBook.sortByNumber();
        myPhoneBook.printPhoneBook();

    }
}
