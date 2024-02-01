package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_101_datetimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy G"); // format of date
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE; // predefined formatter

        String date = dt.format(df2); // creating date string using date & format
        System.out.println(date);
    }
}
