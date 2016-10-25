package com.brainacad.lab2_17_11;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Alexander on 10/24/2016.
 */
public class Storage {

    public static ConcurrentHashMap<String,String> cmap = new ConcurrentHashMap<>(16,0.75f,2);
    public static HashMap<String,String> map = new HashMap<>();

}
