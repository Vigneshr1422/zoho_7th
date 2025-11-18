package ZohoLowLevelDesign.Console.Task_Management_System;
import java.util.*;
public class Task {
    private final int taskId;   // Encapsulation so getter and setter method
   private String taskName;
   private String takeDescription;

   private Date dueDate;

   public Task(int taskId,String taskName,String takeDescription,Date date)
   {
       this.taskId=taskId;
       this.taskName=taskName;
       this.takeDescription=takeDescription;
       dueDate=date;
   }

    public String getTaskName() {
        return taskName;
    }

    public String getTakeDescription() {
        return takeDescription;
    }

    public Date getDueDate() {
        return dueDate;
    }
}
