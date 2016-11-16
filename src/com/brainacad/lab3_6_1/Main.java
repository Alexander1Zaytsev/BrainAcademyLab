package com.brainacad.lab3_6_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by Alexander on 11/17/2016.
 */
public class Main {

    public static void main(String[] args) {

        MyClass mc = new MyClass();
        Class<?> cls = mc.getClass();

        System.out.println("Modifiers of MyClass: ");
        int mods = cls.getModifiers();

        if (Modifier.isPublic(mods)) System.out.println("public");
        if (Modifier.isAbstract(mods)) System.out.println("abstract");

        System.out.println("\nFields");
        Field[] fields = cls.getFields();
        for (Field field: fields){
            Class<?> fType = field.getType();
            System.out.println("\tFieldName: " + field.getName());
            System.out.println("\tFieldType: " + fType.getName());
        }

        System.out.println("\nAll Fields");
        fields = cls.getDeclaredFields();
        for (Field field: fields){
            Class<?> fType = field.getType();
            System.out.println("\tFieldName: " + field.getName());
            System.out.println("\tFieldType: " + fType.getName());
        }

        Constructor<?>[] constructors = cls.getConstructors();
        int i = 0;
        for (Constructor<?> constructor: constructors){
            System.out.print("Constructor" + (i++) + ": ");
            Class<?>[] paramTypes = constructor.getParameterTypes();
            for (Class<?> paramType: paramTypes){
                System.out.print(paramType.getName() + " ");
            }
            System.out.println();
        }

        Method[] methods = cls.getMethods();
        for (Method method: methods){
            System.out.println("Name: " + method.getName());
            System.out.println("\tReturn type: " + method.getReturnType().getName());
            Class<?>[] paramTypesInMethod = method.getParameterTypes();
            System.out.print("\tParameter types: ");
            for (Class<?> paramType: paramTypesInMethod){
                System.out.println(" " + paramType.getName());
            }
            System.out.println();
        }


    }
}
