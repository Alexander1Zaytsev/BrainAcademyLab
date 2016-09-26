package com.brainacad.lab2_9_3;

/**
 * Created by Alex on 9/26/2016.
 */
public class Main {

    public static char[] uniqueChars(String str){

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
          if (!Character.isWhitespace(str.charAt(i))) sb.append(str.charAt(i));
        }

        for (int i = 0; i < sb.length() - 1; i++){
            int del = sb.indexOf(sb.substring(i,i + 1),i + 1);
            while (del != -1){
                    sb.deleteCharAt(del);
                    del = sb.indexOf(sb.substring(i,i + 1),del);
                }
        }

        char[] chars = new char[sb.length()];
        sb.getChars(0,sb.length(),chars,0);

        return chars;
    }

    public static void main(String[] args) {

        String str = "Using methods of class String";
        System.out.println(uniqueChars(str));

    }
}
