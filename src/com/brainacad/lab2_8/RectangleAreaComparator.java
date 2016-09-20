package com.brainacad.lab2_8;

import java.util.Comparator;

/**
 * Created by User on 20/09/2016.
 */
public class RectangleAreaComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (((Rectangle)o1).calcArea() > ((Rectangle)o2).calcArea()) return -1;
        if (((Rectangle)o1).calcArea() < ((Rectangle)o2).calcArea()) return 1;
        return 0;
    }

}
