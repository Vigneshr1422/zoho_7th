package ZohoLowLevelDesign.Console.Event_Management_System;

import java.time.*;
import java.util.*;
public class Event {
    private int id;
    private String EName;
    private LocalDate date;
    private String type;
    private List<user> persons;

    public Event(int id, String EName, LocalDate date, String type) {
        this.id = id;
        this.EName = EName;
        this.date = date;
        this.type = type;
        this.persons = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getEName() {
        return EName;
    }

    public void setEName(String EName) {
        this.EName = EName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<user> getPersons() {
        return persons;
    }

    public void addPersons(user u1)
    {
        if(!persons.contains(u1)){
            persons.add(u1);
        }
    }

    public void removePersons(user u1)
    {
        persons.remove(u1);
    }
    @Override
    public String toString() {
        return "Event ID: " + id +
                ", Name: " + EName +
                ", Date: " + date +
                ", Type: " + type +
                ", Attendees: " + persons.size();
    }

}
