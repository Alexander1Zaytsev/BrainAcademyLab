package com.brainacad.lab2_3;

/**
 * Created by Alex on 9/12/2016.
 */
public class Class230 {
    public static void main(String[] args) {
        MyWindow window1 = new MyWindow(2.0, 1.5, 6, "white", true);
        MyWindow window2 = new MyWindow(1.5, 1.5, 4, "brown", false);
        MyWindow window3 = new MyWindow(1.8, 1.5, 4, "white", true);
        MyWindow window4 = new MyWindow(2.0, 1.5, 6, "brown", false);
        MyWindow window5 = new MyWindow(1.5, 1.5, 4, "white", false);

        MyWindow window6 = new MyWindow();



        MyWindow[] arr = new MyWindow[4]; //Start Lab work 2_3_4

        arr[0] = new MyWindow(2.0, 1.5, 6, "white", true);
        arr[1] = new MyWindow();
        arr[2] = new MyWindow(1.8, 1.5);
        arr[3] = new MyWindow(1.5, 1.5, 4);

        for (int i = 0; i < 4; i++){
            arr[i].printField();
        }
    }
}
