package com.brainacad.lab2_12_3_lab2_12_4;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Alex on 10/3/2016.
 */
public class MyPhone {

    MyPhoneBook myPhoneBook = new MyPhoneBook();

    public MyPhone() {
    }

    public MyPhoneBook switchOn(){
        System.out.print("Loading PhoneBook records…");
        myPhoneBook.addPhoneNumber("Vova", "523654136");
        myPhoneBook.addPhoneNumber("Vasya", "253654137");
        myPhoneBook.addPhoneNumber("Petya", "633654138");
        myPhoneBook.addPhoneNumber("John", "163654139");
        myPhoneBook.addPhoneNumber("Nick", "193654130");
        myPhoneBook.addPhoneNumber("George", "535541360");
        myPhoneBook.addPhoneNumber("Konstantyn", "153654137");
        myPhoneBook.addPhoneNumber("Ivan", "633655238");
        myPhoneBook.addPhoneNumber("Debby", "163668439");
        myPhoneBook.addPhoneNumber("Irina", "936458130");
        System.out.println("OK");
        return myPhoneBook;
    }

    public void call(int i){
        System.out.println("Calling to:" + myPhoneBook.phoneNumbers[i-1]);
    }

    public static class MyPhoneBook {

        private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

        public static class PhoneNumber {

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
            public String toString() {
                return "name: " + name + ", phone: " + phone;
            }

        }

        public void addPhoneNumber(String name, String phone) {
            for (int i = 0; i < phoneNumbers.length; i++) {
                if (phoneNumbers[i] == null) {
                    phoneNumbers[i] = new PhoneNumber(name, phone);
                    break;
                }
            }
        }

        public void printPhoneBook() {
            for (PhoneNumber element : phoneNumbers) {
                if (element != null) System.out.println(element);
            }
        }

        public void sortByName() {
            Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber name0, PhoneNumber name1) {
                    return name0.getName().compareToIgnoreCase(name1.getName());
                }
            });
        }

        public void sortByNumber() {
            Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber phone0, PhoneNumber phone1) {
                    return Integer.parseInt(phone0.getPhone()) - Integer.parseInt(phone1.getPhone());
                }
            });
        }

    }

    static class Camera {
    }

    static class Bluetooth {
    }

    static class TouchScreen {
    }

    static class PowerOnButton {
    }

    class PhoneBattery {
    }

    static class PhoneDisplay {
    }

    static class PhoneSpeaker {
    }
}

class MemoryCard {
}

class SimCard {
}

class HeadPhones {
}

class PhoneCharger {
}
