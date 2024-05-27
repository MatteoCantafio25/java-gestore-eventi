package org.lessons.events;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Event {

    // Attributi
    private String title;
    private LocalDate date;
    private int totalSeats;
    private int bookedSeats;


    // Costruttore
    public Event (String title, LocalDate date, int totalSeats){
        this.title = title;
        this.date = validateDate(date);
        this.totalSeats = totalSeats;
        bookedSeats = 0;
    }

    // Metodi
    public void bookSeats(int seats) throws IllegalArgumentException{
        if (seats <= 0){
            throw new IllegalArgumentException("Invalid number of seats: " + seats);
        }

        if (bookedSeats + seats > totalSeats){
            throw new IllegalArgumentException("Can't book this number of seats: " + seats);
        }
        bookedSeats += seats;
    }

    public void cancelBoooking(int seats) throws IllegalArgumentException{
        if (seats <= 0){
            throw new IllegalArgumentException("Invalid number of seats: " + seats);
        }
        if (bookedSeats - seats < seats){
            throw new IllegalArgumentException("Can't cancel this number of seats: " + seats);
        }
        if (date.isBefore(LocalDate.now())){
            throw new IllegalArgumentException("Invalid date: " + date);
        }
        bookedSeats -= seats;
    }
    
    private LocalDate validateDate(LocalDate date){

        if (date.isBefore(LocalDate.now())){
            throw new IllegalArgumentException("Invalid date: " + date);
        }else {
            return date;
        }
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMMM dd", Locale.ENGLISH);
        return date.format(formatter) + " - " + title;
    }

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
