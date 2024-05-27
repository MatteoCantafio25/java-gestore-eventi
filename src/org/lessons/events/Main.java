package org.lessons.events;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String eventTitle = "";
        LocalDate eventDate = null;
        int totalEventSeats = 0;
        int bookChoice = 0;
        boolean exit = false;
        int userChoice;
        int cancelChoice;
        int availableSeats;

        Scanner scanner = new Scanner(System.in);

        Event event = null;

        while(event == null){
            try {
                System.out.print("Whats the title of the event? ");
                eventTitle = scanner.nextLine();

                System.out.print("When will the event be held?(YYYY-MM-D) ");
                eventDate = LocalDate.parse(scanner.nextLine());

                System.out.print("Enter the number of seats for this event ");
                totalEventSeats = Integer.parseInt(scanner.nextLine());

                event = new Event(eventTitle, eventDate, totalEventSeats);
            } catch (IllegalArgumentException e){
                System.out.println("Error: " + e.getMessage());
            } catch (DateTimeParseException e){
                System.out.println("Invalid date: " + eventDate);
            } catch (NullPointerException e){
                System.out.println("Error " + e.getMessage());
            }
        }

        while(!exit){
            System.out.print("Enter 1 to book seats, 2 to calcel booking, 3 exit ");
            userChoice = Integer.parseInt(scanner.nextLine());

            try {
                if (userChoice == 1){
                    System.out.print("How many seats do you want to book? ");
                    bookChoice = Integer.parseInt(scanner.nextLine());

                    event.bookSeats(bookChoice);
                } else if (userChoice == 2){
                    System.out.print("How many seats do you want to book? ");
                    cancelChoice = Integer.parseInt(scanner.nextLine());

                    event.cancelBoooking(cancelChoice);
                } else if (userChoice == 3){
                    exit = true;
                    System.out.println("Have a good day!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        availableSeats = event.getTotalSeats() - event.getBookedSeats();

        System.out.println("Title: " + event.getTitle());
        System.out.println("Date: " + event.getDate());
        System.out.println("Total seats: " + event.getTotalSeats());
        System.out.println("Booked seats: " + event.getBookedSeats());
        System.out.println("Available seats: " + availableSeats);


        scanner.close();
    }
}
