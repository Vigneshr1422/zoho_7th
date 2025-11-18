package ZohoLowLevelDesign.Console.Inventary_System;
import java.util.*;

public class inventory {
private  List<items> stocks=new ArrayList<>();

        public void AddItem(String name,int quantity,int price)
        {
            stocks.add(new items(name,quantity,price));
            System.out.println("Item Added Successfully ");
        }
        public void RemoveItem(int id)
        {
            for(int i=0;i<stocks.size();i++)
            {
                if(stocks.get(i).getCountId()==id)
                {
                    stocks.remove(i);
                    System.out.println("Item is deleted");
                    return ;
                }
            }
            System.out.println("Item not found ");

        }

        public void viewItem()
        {
            if(stocks.isEmpty()){
                System.out.println("Empty Items ");
            }
            for(items x:stocks){
                x.display();
            }

        }

        public items search(int id)
        {
            for(items pro:stocks)
            {
                if(pro.getCountId()==id){
                    return pro;
                }
            }
            return null;
        }

        public boolean buyItem(int id)
        {
            items pro=search(id);
            if(pro!=null && pro.getQuantity()>0)
            {
             pro.setQuantity();
                System.out.println("Purchase successful");
                return  true;
            }
            System.out.println("Item out of stock ");
            return false;
        }
}
