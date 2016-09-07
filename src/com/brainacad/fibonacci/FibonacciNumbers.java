package com.brainacad.fibonacci;

/**
 * Created by Alex on 9/7/2016.
 */
public class FibonacciNumbers {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int k){
        if (k == 1) return 1;
        if (k == 2) return 1;
        return fibonacci(k-1) + fibonacci(k-2);
    }
}
