package com.brainacad.lab2_13_1;

/**
 * Created by User on 06/10/2016.
 */
public enum MyDayOfWeek {
    SUUNDAY,
    MONDAY,
    TUSDAY,
    WEDNESDAY,
    THURSDEY,
    FRIDAY,
    SATURDAY;

    public MyDayOfWeek next(){
        MyDayOfWeek m = null;
        MyDayOfWeek[] arrM = MyDayOfWeek.values();
            if (this.ordinal() == 6) {
                m = MyDayOfWeek.SUUNDAY;
            } else {
                m = arrM[this.ordinal() + 1];
            }
        return m;
    }


}
