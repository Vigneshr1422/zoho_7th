package ZohoLowLevelDesign.Console.Event_Management_System;
import ZohoLowLevelDesign.Console.Login_SignUp.User;

import java.util.*;
import java.time.*;
public class EventManager {
    private Map<Integer,Event> mapEvent=new HashMap<>();
    private Map<Integer,user>mapUser=new HashMap<>();

    public void createEvent(int id,String Ename, LocalDate date,String type)
    {
        if(mapEvent.containsKey(id)){
            System.out.println("Already event here id is "+id);
        }else
        {
            Event e=new Event(id,Ename,date,type);
            mapEvent.put(id,e);
            System.out.println("Event Created "+e);
        }
    }

    public void deleteEvent(int id)
    {
        Event remove=mapEvent.remove(id);
        if(remove!=null){
            System.out.println("Event deleted "+remove);
        }else
        {
            System.out.println("Not found");
        }
    }

    public void updateEvent(int id,String Ename, LocalDate date, String type)
    {
        Event ev=mapEvent.get(id);
        if(ev!=null)
        {
            ev.setEName(Ename);
            ev.setDate(date);
            ev.setType(type);

        }else
        {
            System.out.println("Event not found");
        }
    }

    public void addUser(int id,String name) {
        if (mapUser.containsKey(id)) {
            System.out.println("Already found");
        } else {
            user u1 = new user(id, name);
            mapUser.put(id,u1);
        }
    }

    public void registerEvent(int id,int EventId)
    {
        user u=mapUser.get(id);
        Event e=mapEvent.get(EventId);

        if(u!=null && e!=null)
        {
            if(!e.getPersons().contains(u)){
                e.addPersons(u);
                System.out.println("User register "+u);
            }else
            {
                System.out.println("Already registered");
            }

        }else
        {
            System.out.println("Not register ! user not found ");
        }
    }

    public void cancelEvent(int id,int EventId)
    {
        user u=mapUser.get(id);
        Event e=mapEvent.get(EventId);

        if(u!=null && e!=null)
        {
            if(e.getPersons().contains(u)){
                e.removePersons(u);
                System.out.println("User removed "+u);
            }else
            {
                System.out.println("user not registered");
            }

        }else
        {
            System.out.println("Not deleted ! user not found ");
        }
    }

    public void viewEvent(int id)
    {
        Event e=mapEvent.get(id);
        if(e!=null){
            System.out.println("Event Details "+e);
        }else
        {
            System.out.println("Not found");
        }
    }
}
