package ZohoLowLevelDesign.Console.Task_Management_System;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

// single responsibility principle
public class TaskManager {
    private  HashMap<Integer,Task>tasks=new HashMap<>();
    int idCounter=0;
    Scanner in=new Scanner(System.in);
    public void addTask()
    {
        System.out.println("Enter Task Name: ");
        String name=in.nextLine();
        System.out.println("Enter task Description");
        String description=in.nextLine();
        Date dueDate=null;
        while (dueDate==null)
        {
            dueDate=getDate();
        }
        tasks.put(++idCounter,new Task(idCounter,name,description,dueDate));
        System.out.println("Task Add Successfully");
    }

    private Date getDate() {
        System.out.print("Enter the Date (dd-MM-yyyy): ");
        String d = in.nextLine();
        SimpleDateFormat ob = new SimpleDateFormat("dd-MM-yyyy");
        ob.setLenient(false);
        try {
            Date date = ob.parse(d);
            Date today = ob.parse(ob.format(new Date())); // remove time
            if (date.before(today)) {
                System.out.println("Please enter a present or future date.");
                return null;
            }
            return date;
        } catch (ParseException e) {
            System.out.println("❌ Invalid date. Try again.");
            return null;
        }
    }


    public void viewTask()
    {
        for(Map.Entry<Integer,Task>task:tasks.entrySet())
        {
            System.out.printf("%-2d. %-20s | Description: %-10s\n | Due date : %-10s\n " ,
                    task.getKey(),
                    task.getValue().getTaskName(),
                    task.getValue().getTakeDescription(),
                    dateToString(task.getValue().getDueDate()));
        }
    }
    public String dateToString(Date dueDate)
    {
        SimpleDateFormat dateFormat =new SimpleDateFormat("dd-MM-yyyy");
         return dateFormat.format(dueDate);

    }
}
