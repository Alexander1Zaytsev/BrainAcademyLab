package com.brainacad.lab2_17_8_lab2_17_9;

import com.brainacad.lab2_6_5.shapes.Triangle;

/**
 * Created by Alexander on 10/24/2016.
 */
public class BankTest {

    public static final int N_ACCOUNTS = 5;
    public static final int INIT_BALANCE = 1000;

    public static void main(String[] args) {

        Bank bank = new Bank(N_ACCOUNTS,INIT_BALANCE);

        Transfer[] transfer = new Transfer[N_ACCOUNTS];
        for (int i = 0; i < transfer.length; i++) {
            transfer[i] = new Transfer(bank, i, INIT_BALANCE);
            transfer[i].start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Transfer element:transfer){
            element.setStop(true);
        }
    }

}
