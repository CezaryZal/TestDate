package com.CezaryZal.testDb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil {
    public static void main(String[] args) throws ParseException {

        java.time.LocalDate date = java.time.LocalDate.now();
        System.out.println("java.time.LocalDate = " + date);

        java.sql.Date sqlDate = java.sql.Date.valueOf(date);
        System.out.println("java.sql.Date = " + sqlDate);

        SimpleDateFormat foo = new SimpleDateFormat("yyyy-MM-dd");
        Date dateUni = foo.parse("2018-05-23");
        System.out.println(foo.format(dateUni) + "\n");


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = new GregorianCalendar(2018,4,24);
        System.out.println(sdf.format(calendar.getTime()));


    }
}
