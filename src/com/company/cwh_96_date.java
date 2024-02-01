package com.company;

import java.util.Date;

public class cwh_96_date {
    public static void main(String[] args) {
        // returns us the number of years passed since 1st Jan 1970
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);

        // returns us the current date & time
        Date d = new Date();
        System.out.println(d);

        System.out.println(d.getTime()); // returns no. of milliseconds since 1st Jan 1970
        System.out.println(d.getDate()); // returns the current day of this month
        System.out.println(d.getSeconds());
        System.out.println(d.getYear()); // returns no. of years passed since 1900
        System.out.println(d.getDay());
    }
}
