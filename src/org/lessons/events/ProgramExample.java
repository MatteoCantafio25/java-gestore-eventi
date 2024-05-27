package org.lessons.events;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class ProgramExample {
    public static void main(String[] args) {

        Concert concert1 = new Concert("Coldplay", LocalDate.parse("2025-09-12"), 900, LocalTime.parse("18:30"), BigDecimal.valueOf(78.00));
        Concert concert2 = new Concert("Taylor Swift", LocalDate.parse("2027-05-14"), 1000, LocalTime.parse("20:00"), BigDecimal.valueOf(99.99));
        Concert concert3 = new Concert("Billie Eilish", LocalDate.parse("2026-03-22"), 160, LocalTime.parse("19:00"), BigDecimal.valueOf(54.99));
        Concert concert4 = new Concert("Ed Sheeran", LocalDate.parse("2028-09-24"), 890, LocalTime.parse("22:00"), BigDecimal.valueOf(249.99));
        Concert concert5 = new Concert("Harry Styles", LocalDate.parse("2025-08-14"), 400, LocalTime.parse("23:40"), BigDecimal.valueOf(220.50));
        Concert concert6 = new Concert("Beyoncé", LocalDate.parse("2025-08-14"), 590, LocalTime.parse("22:30"), BigDecimal.valueOf(120.99));
        Concert concert7 = new Concert("The Weeknd", LocalDate.parse("2025-08-14"), 350, LocalTime.parse("19:00"), BigDecimal.valueOf(210.99));
        Concert concert8 = new Concert("Dua Lipa", LocalDate.parse("2025-08-14"), 2000, LocalTime.parse("20:00"), BigDecimal.valueOf(299.99));
        Concert concert9 = new Concert("Bruno Mars", LocalDate.parse("2025-05-21"), 800, LocalTime.parse("23:00"), BigDecimal.valueOf(109.99));
        Concert concert10 = new Concert("Post Malone", LocalDate.parse("2026-08-14"), 250, LocalTime.parse("20:00"), BigDecimal.valueOf(74.99));

        ProgramEvents events = new ProgramEvents("Evens");
        System.out.println(events);
        events.addEvent(concert1);
        events.addEvent(concert2);
        events.addEvent(concert3);
        events.addEvent(concert4);
        events.addEvent(concert5);
        events.addEvent(concert6);
        events.addEvent(concert7);
        events.addEvent(concert8);
        events.addEvent(concert9);
        events.addEvent(concert10);

        System.out.println("***************");

        System.out.println("Number of events: " + events);

        System.out.println("***************");

        events.dateEvents(LocalDate.parse("2025-08-14"));

        System.out.println("***************");

        events.numOfEvents();

        System.out.println("***************");

        System.out.println(events);

        System.out.println("***************");

        //events.clearList();
        //System.out.println("Number of events: " + events);


    }
}
