package com.brainacad.lab2_15_3;

import java.util.*;

/**
 * Created by Alexander on 10/11/2016.
 */
public class Main {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        List<String> linkedList2 = new LinkedList<>();
        int startLength = 11;

        for (int i = 0; i < startLength; i++){
            arrayList.add("number_" + i);
            linkedList.add("number_" + i);
            linkedList2.add("number_" + i);
        }

        Iterator<String> itrArray = arrayList.iterator();
        Iterator<String> itrLinked = linkedList.iterator();

        System.out.println("ArrayList");
        while (itrArray.hasNext()) System.out.println(itrArray.next());

        System.out.println("\nLinkedList");
        while (itrLinked.hasNext()) System.out.println(itrLinked.next());

        System.out.println("\nAdd array list into linked list from any position");
        ListIterator<String> lstItr = arrayList.listIterator();
        while (lstItr.hasNext()) linkedList.add(11,lstItr.next());

        printElement(linkedList);

        System.out.println("\nAdd array list into linked list moving backward");
        ListIterator<String> lstItr2 = arrayList.listIterator(arrayList.size());
        while (lstItr2.hasPrevious()) linkedList2.add(lstItr2.previous());

        printElement(linkedList2);
    }

    static <T> void printElement(Collection<T> collection){
        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
