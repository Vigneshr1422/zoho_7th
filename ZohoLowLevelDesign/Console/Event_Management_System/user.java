package ZohoLowLevelDesign.Console.Event_Management_System;

public class user {
    private int id;
    private String name;

    public user(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString()
    {
        return "User id "+id+" \nuser name is "+name;
    }
}
