package com.brainacad.lab3_1_1;

import java.io.File;
import java.util.Arrays;

/**
 * Created by Alexander on 10/25/2016.
 */
public class MyFilesList {

    public static void main(String[] args) {
        File folder = new File("src\\com\\brainacad\\lab3_1_1");

        System.out.println(Arrays.toString(folder.list()));
    }
}
