package org.neoteric.datevalidation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateValidationTest {
    public static void main(String[] args) {
        Date mylocaldate=new Date();

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat();
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));



    }
}
