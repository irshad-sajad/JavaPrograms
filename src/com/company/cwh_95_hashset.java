package com.company;

import java.util.HashSet;

public class cwh_95_hashset {
    public static void main(String[] args) {
        // HashSet
        // Hash --> it's using hashing technique internally.
        // Set --> collection of unique items (i.e., repetitions are not allowed).
        HashSet<Integer> myHashSet = new HashSet<>(5,0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11);
        System.out.println(myHashSet);
    }
}
