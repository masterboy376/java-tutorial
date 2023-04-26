package com.company;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_Class_101 {
    public static void main(String[] args) {
     LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        System.out.println(" ");

        // DateTimeFormatter object
        DateTimeFormatter dtf = DateTimeFormatter.BASIC_ISO_DATE;
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // custom date format
        String myDate = dt.format(dtf);// creating date string using date and format( inbuilt format )
        System.out.println(myDate);

        // ISO date
        String myDate1 = dt.format(dtf1);// creating date string using date and format
        System.out.println(myDate1);

        /*
        // symbols used for the date formatting purpose.
G -->  era    text
u -->  year
y -->  year-of-era
D -->  day-of-year
M/L -->    month-of-year
d -->  day-of-month
g -->  modified-julian-day
Q/q -->    quarter-of-year
Y -->  week-based-year
w -->  week-of-week-based-year
W -->  week-of-month
E -->  day-of-week
e/c -->    localized day-of-week
B -->  period-of-day
h -->  clock-hour-of-am-pm (1-12)
K -->  hour-of-am-pm (0-11)
k -->  clock-hour-of-day (1-24)
H -->  hour-of-day (0-23)
m -->  minute-of-hour
s -->  second-of-minute
S -->  fraction-of-second
A -->  milli-of-day
n -->  nano-of-second
N -->  nano-of-day    number
V -->  time-zone ID
v -->  generic time-zone name
z -->  time-zone
O -->  localized zone-offset
X -->  zone-offset 'Z' for zero
x -->  zone-offset
Z -->  zone-offset
p -->  pad next
' -->  escape for text    delimiter
'' --> single quote   literal    '
[ -->  optional section start
] -->  optional section end
# -->  reserved for future use
{ -->  reserved for future use
} -->  reserved for future use
        */
    }
}
