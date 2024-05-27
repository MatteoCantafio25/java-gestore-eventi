package org.lessons.events;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concert extends Event{

    // Attributi
    private LocalTime hour;
    private BigDecimal price;

    // Costruttore
    public Concert (String title, LocalDate date, int totalSeats, LocalTime hour, BigDecimal price) throws IllegalArgumentException {
        super(title, date, totalSeats);
        this.hour = hour;
        this.price = validatePrice(price);
    }

    // Metodi
    public LocalTime getHour() {
        return hour;
    }

    public void setHour(LocalTime hour) {
        this.hour = hour;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = validatePrice(price);
    }

    private BigDecimal validatePrice(BigDecimal price) throws IllegalArgumentException{
        if (price == null || price.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Price cant be null or negative");
        }
        return price;
    }

    @Override
    public String toString() {
        return formatDateTime(getDate(), getHour()) + " - " + getTitle() + " - " + formatPrice();
    }

    private String formatPrice() {
        return String.format("%,.2f €", price);
    }

    private String formatDateTime(LocalDate date, LocalTime time) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        String formattedDate = date.format(dateFormatter);
        String formattedTime = time.format(timeFormatter);

        return formattedDate + " " + formattedTime;
    }

}
