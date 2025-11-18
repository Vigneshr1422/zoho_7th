package ZohoLowLevelDesign.Console.Task_Management_System;

import java.util.*;

public class Main {
    // version 1
    // task add and view
    // task id , name
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        TaskManager object=new TaskManager();
        System.out.println("Welcome to Task Management Bro ");
        boolean run=true;
        while(run)
        {
            System.out.println("\n1.Add Task \n2.View Task\n0.Exit ");
            System.out.println("Enter user Choice");
            int choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Task Adding...");
                    object.addTask();
                    break;
                case 2:
                    object.viewTask();
                    System.out.println("Task Viewing...");
                    break;
                case 0:
                    run=false;
            }
        }
        in.close();
    }


}
