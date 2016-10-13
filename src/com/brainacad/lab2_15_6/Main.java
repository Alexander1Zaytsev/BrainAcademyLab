package com.brainacad.lab2_15_6;

import java.util.Scanner;

/**
 * Created by Alexander on 10/13/2016.
 */
public class Main {

    public static void main(String[] args) {

        MyTranslator translator = new MyTranslator();

        translator.addNewWord("cat", "кот");
        translator.addNewWord("mouse", "мышь");
        translator.addNewWord("caught", "поймал");
        translator.addNewWord("a", "");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String[] parts = sc.nextLine().split(" ");

        for (String element : parts) {
            System.out.print(translator.translate(element) + " ");
        }

    }
}
