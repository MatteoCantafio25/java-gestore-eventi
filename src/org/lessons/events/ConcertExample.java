package org.lessons.events;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class ConcertExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2024-09-11");
        LocalTime time = LocalTime.parse("11:20");

        Concert concert = new Concert("pippo", date, 200, time , new BigDecimal("30.99") );

        System.out.println(concert.getHour());
        System.out.println(concert.getPrice());
        System.out.println(concert.getDate());
        System.out.println(concert);
    }
}
