package org.lessons.events;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramEvents {

    // Attributi
    private String title;
    private List<Event> events;

    // Costruttore
    public ProgramEvents(String title) throws IllegalArgumentException{
        this.title = validateTitle(title);
        this.events = new ArrayList<>();
    }

    // Metodi
    public void addEvent(Event event){
        if (event == null){
            throw new IllegalArgumentException("The event cannot be null");
        }
        events.add(event);
    }

    public void dateEvents(LocalDate date){
        String message = "";
        for (Event event : events) {
            if (event.getDate().equals(date)) {
                message += event + " / ";
            }
        }
        System.out.println("Event scheduled for the " + date + ":\n" + message);
    }

    public void numOfEvents(){
        System.out.println("There are " + events.size() + " events in this moment");
    }

    public void clearList(){
        events.clear();
    }

    @Override
    public String toString() {
        String message = "";
        Collections.sort(events);

        for(Event e : this.events){
            message += e.getDate() +" - " + e.getTitle() + "\n";
        }
        return message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = validateTitle(title);
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    private String validateTitle (String title) throws IllegalArgumentException {
        if(title == null || title.isEmpty()){
            throw new IllegalArgumentException("Event must have a valid title");
        }
        return title;
    }
}

