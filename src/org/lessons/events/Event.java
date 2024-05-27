package org.lessons.events;

import java.time.LocalDate;

public class Event {

    // Attributi
    String title;
    LocalDate date;
    int totalSeats;
    int bookedSeats;


    // Costruttore
    public Event (String title, LocalDate date, int totalSeats){
        this.title = title;
        this.date = date;
        this.totalSeats = totalSeats;
        bookedSeats = 0;
    }

    // Metodi
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }
}
