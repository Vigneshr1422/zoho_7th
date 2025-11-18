package ZohoLowLevelDesign.Console.Inventary_System;
import java.util.*;
public class user_ {
    inventory ob1=new inventory();
    Scanner in=new Scanner(System.in);
    public void userDetails() {
        while (true) {
            System.out.println("\n User Menu " +
                    "\n1.Buy Item \n2.View Item \n3.Search Item \n4.Exit");

            int n=in.nextInt();
            switch (n)
            {
                case 1:
                    System.out.println("Enter item ID to buy ");
                    int id=in.nextInt();
                    ob1.buyItem(id);
                    break;
                case 2:
                    System.out.println("View item is below");
                    ob1.viewItem();
                case 3:
                    System.out.println("Enter the Search Item ID");
                    int idd=in.nextInt();
                    items it=ob1.search(idd);

                    if(it!=null)
                    {
                        it.display();
                    }else
                    {
                        System.out.println("Item not found");
                    }
                case 4:
                    return;
                default:
                    System.out.println("Invalid User choice");

            }
        }
    }
}
