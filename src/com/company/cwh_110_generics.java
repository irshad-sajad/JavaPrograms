package com.company;

import java.util.ArrayList;

class MyGeneric<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}

public class cwh_110_generics {
    public static void main(String[] args) {
        // ArrayList arrayList = new ArrayList(); --> error
        // ArrayList<int> arrayList = new ArrayList(); --> error
        ArrayList<Integer> arrayList = new ArrayList();
        //arrayList.add("str");
        arrayList.add(45);
        arrayList.add(55);

        // int a = (int) arrayList.get(1); --> if ArrayList declared without specified datatype
        int a = arrayList.get(1);
        // System.out.println(a);

        MyGeneric<String, Integer> g1 = new MyGeneric(24,"MyString is my string", 56);
        String str = g1.getT1();
        Integer in = g1.getT2();
        System.out.println(str + " " + in);
    }
}
