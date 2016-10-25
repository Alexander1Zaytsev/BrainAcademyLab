package com.brainacad.lab3_1_3;

import java.io.*;

/**
 * Created by Alexander on 10/25/2016.
 */
public class MyFileCopy {

    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("src\\com\\brainacad\\lab3_1_1\\MyFilesList.java");
            out = new FileOutputStream("src\\com\\brainacad\\lab3_1_3\\test.txt");
            int c;

            try {
                while ((c = in.read()) != -1) {
                    out.write(c);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            if (in != null) in.close();
            if (out != null) out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
