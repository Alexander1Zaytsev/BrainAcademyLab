package com.brainacad.lab2_15_6;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alexander on 10/13/2016.
 */
public class MyTranslator {

    private Map<String,String> dictionary = new HashMap<>();

    public void addNewWord(String en,String ru){
        dictionary.put(en,ru);
    }

    public String translate(String en){
        return dictionary.get(en);
    }
}
