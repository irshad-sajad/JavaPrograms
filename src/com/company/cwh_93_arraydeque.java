package com.company;

import java.util.ArrayDeque;

public class cwh_93_arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(3);
        ad.add(5);
        ad.getFirst(); // removes the first value
        ad.pollLast(); // removes the last value
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());
    }
}
