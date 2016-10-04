package com.brainacad.lab2_12_1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Alex on 10/3/2016.
 */
public class MyPhoneBook {

    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

    public static class PhoneNumber{

        private String name;
        private String phone;

        public PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        @Override
        public String toString(){
            return "name: " + name + ", phone: " + phone;
        }

    }

    public void addPhoneNumber(String name, String phone){
        for (int i = 0; i < phoneNumbers.length; i++){
            if (phoneNumbers[i] == null){
                phoneNumbers[i] = new PhoneNumber(name, phone);
                break;
            }
        }
    }

    public void printPhoneBook(){
        for (PhoneNumber element: phoneNumbers){
            if (element != null) System.out.println(element);
        }
    }

   public void sortByName(){
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>(){
            @Override
            public int compare(PhoneNumber name0, PhoneNumber name1){
                return name0.getName().compareToIgnoreCase(name1.getName());
            }
        });
    }

    public void sortByNumber(){
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber phone0, PhoneNumber phone1) {
                return Integer.parseInt(phone0.getPhone()) - Integer.parseInt(phone1.getPhone());
            }
        });
    }

}
