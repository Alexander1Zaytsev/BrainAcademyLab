package com.brainacad.integralSelfInvokation;

/**
 * Created by Alex on 9/7/2016.
 */
public class SelfInvocation {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(integral(a));
    }

    public static int integral(int n){
        if (n == 1)return 1;
        return n*integral(n-1);
    }

}
