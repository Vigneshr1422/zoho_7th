package ZohoLowLevelDesign.Console.Inventary_System;
import java.util.*;
public class admin {
    inventory ob1=new inventory();
    Scanner in=new Scanner(System.in);
    public void adminDetails ()
    {
        while(true)
        {
            System.out.println("\nAdmin Menu :\n1. Add Item\n 2. View All\n 3. Delete ");
            int n=in.nextInt();
            in.nextLine();

            switch (n)
            {
                case 1:
                    System.out.println("Enter item name ");
                    String name=in.nextLine();

                    System.out.println("Enter Price ");
                    int price=in.nextInt();

                    System.out.println("Enter Quantity: ");
                    int qty=in.nextInt();

                    ob1.AddItem(name,price,qty);
                    break;
                case 2:
                    System.out.println("View Items is below ");
                    ob1.viewItem();
                    break;
                case 3:
                    System.out.println("Enter Delete Item Id");
                    int id=in.nextInt();
                    ob1.RemoveItem(id);
                    break;
                case 4:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid Admin button");
            }
        }

    }
}
