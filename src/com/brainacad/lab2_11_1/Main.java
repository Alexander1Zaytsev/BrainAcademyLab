package com.brainacad.lab2_11_1;

/**
 * Created by Alex on 9/29/2016.
 */
public class Main {
    public static void main(String[] args) {

        try{
            throw new Exception("My Exception");
        } catch (Exception e){
            System.out.println(e.getMessage() + " + Catch My Exception");
        } finally {
            System.out.println("Finally");
        }
    }
}
