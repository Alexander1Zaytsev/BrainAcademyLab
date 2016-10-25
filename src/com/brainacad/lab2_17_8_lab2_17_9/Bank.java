package com.brainacad.lab2_17_8_lab2_17_9;

/**
 * Created by Alexander on 10/24/2016.
 */
public class Bank {

    private int[] accounts;
    private int numOfAccounts;

    public Bank(int num_accounts, int init_Balance) {
        accounts = new int[num_accounts];
        numOfAccounts = num_accounts;

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = init_Balance;
        }
    }

    synchronized void transfer(int from, int to, int amount){
        System.out.println("from:" + from + " to:" + to + " amount:" + amount);
        if (accounts[from] < amount) return;
        accounts[from] = accounts[from] - amount;
        try {
            Thread.sleep((long)(100 * Math.random()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        accounts[to] = accounts[to] + amount;
        System.out.println("Total balance" + totalBalance());
    }

    public int totalBalance(){
        int total = 0;
            for (int v : accounts) {
                total = total + v;
            }
        return total;
    }

    public int getNumOfAccounts() {
        return numOfAccounts;
    }
}
