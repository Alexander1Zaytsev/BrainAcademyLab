package com.brainacad.lab3_6_2;

import java.lang.reflect.Field;

/**
 * Created by Alexander on 11/17/2016.
 */
public class Main {

    private static class MyClass{
        private String myStr = "abcd";
    }

    public static void main(String[] args) {

        Class<?> cls = MyClass.class;

        Field[] fields = cls.getDeclaredFields();
        fields = cls.getDeclaredFields();
        for (Field field: fields){
            Class<?> fType = field.getType();
            System.out.println("\tFieldName: " + field.getName());
            System.out.println("\tFieldType: " + fType.getName());
        }

        MyClass obj = new MyClass();

        try {
            Field field = cls.getDeclaredField("myStr");
            field.setAccessible(true);
            String stringValue = (String) field.get(obj);
            System.out.println("Old private String value: " + stringValue);
            field.set(obj,"zxcv");
            String stringValue1 = (String) field.get(obj);
            System.out.println("New private String value: " + stringValue1);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
