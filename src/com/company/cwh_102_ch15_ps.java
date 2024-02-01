package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class cwh_102_ch15_ps {
    public static void main(String[] args) {
        // problem-1
        ArrayList<String> list = new ArrayList<>();
        list.add("student 1");
        list.add("student 2");
        list.add("student 3");
        list.add("student 4");
        list.add("student 5");
        list.add("student 6");
        list.add("student 7");
        list.add("student 8");
        list.add("student 9");
        list.add("student 10");

        for (String name: list) {
            System.out.println(name);
        }

        //problem-2
        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        // problem-3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        // problem-4
        LocalDateTime dt = LocalDateTime.now(); // date
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s"); // format of date

        String time = dt.format(df); // creating date string using date & format
        System.out.println(time);

        // problem-5
        HashSet<Integer> s = new HashSet();
        s.add(5);
        s.add(6);
        s.add(23);
        s.add(45);
        s.add(9);
        s.add(6);
        System.out.println(s);
    }
}
