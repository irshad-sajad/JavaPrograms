package com.company;

//import java.util.ArrayList;
import java.util.LinkedList;

public class cwh_92_linkedlist {
    public static void main(String[] args) {
        // create a linked list
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        // add/insert elements in list
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(13);

        // add/insert elements in list2
        list2.add(11);
        list2.add(12);
        list2.add(13);

        // append list2 elements to list from 0th index
        list.addAll(0,list2);

        // adds element at the first index
        list.addFirst(222);

        // adds element at the last index
        list.addLast(456);

        // removes all the elements from this list
        // list.clear();

        // replaces the element at the specified position in this list with the specified element.
        list.set(3,14); // replaces 2 with 14

        // returns a shallow copy of this ArrayList instance
        System.out.println(list.clone()); // [11,12,13,2,3,4,5,6]

        // checks whether the list contains the specified element
        System.out.println(list.contains(3)); // true

        // returns the index of first/last occurrence of the specified element in the list,
        // or -1 if this list does not contain the element
        System.out.println(list.indexOf(13)); // 2
        System.out.println(list.lastIndexOf(13)); // 7

        // checks whether the list is empty or not
        System.out.println(list.isEmpty()); // false

        // returns a sublist between startIndex(inclusive) and endIndex(exclusive)
        System.out.println(list.subList(0,3)); // [11,12,13]

        // access the list elements
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)); // 11,12,13,2,3,4,5,6
            System.out.print(", ");
        }
    }
}
