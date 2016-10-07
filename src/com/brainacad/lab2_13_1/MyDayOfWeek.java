package com.brainacad.lab2_13_1;

/**
 * Created by User on 06/10/2016.
 */
public enum MyDayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public MyDayOfWeek next(){
        MyDayOfWeek m;
        MyDayOfWeek[] arrM = MyDayOfWeek.values();
            if (this.ordinal() == 6) {
                m = MyDayOfWeek.SUNDAY;
            } else {
                m = arrM[this.ordinal() + 1];
            }
        return m;
    }


}
