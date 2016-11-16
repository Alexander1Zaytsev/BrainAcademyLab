package com.brainacad.lab3_6_3;

import com.brainacad.lab3_6_1.MyClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Alexander on 11/17/2016.
 */
public class Main {

    public static void main(String[] args) {
        Class<?> cls = MyClass.class;

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

        System.out.println();

        Class<?>[] paramTypes = new Class<?>[]{int.class};
        try {
            Constructor<?> constructor = cls.getConstructor(paramTypes);
            MyClass myClass = (MyClass)constructor.newInstance(33);
            Field fieldA = cls.getDeclaredField("a");
            System.out.println("\nFields");
            Field[] fields = cls.getFields();
            for (Field field: fields){
                Class<?> fType = field.getType();
                System.out.println("\tFieldName: " + field.getName());
                System.out.println("\tFieldType: " + fType.getName());
            }
            System.out.println("\tFieldValue: " + fieldA.getInt(myClass));

            Class<?>[] parType = new Class<?>[]{int.class};
            Method met = cls.getMethod("setA",parType);
            Object[] arguments = new Object[]{Integer.valueOf(66)};
            met.invoke(myClass,arguments);
            System.out.println("Value a after reflection invoke method setA is equal: " + myClass.getA());


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
