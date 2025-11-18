package ZohoLowLevelDesign.ConsoleApplications.Super_store;
import java.util.*;
public class product_service {

    HashMap<Integer,product>pro=new HashMap<>();

    public  void addProduct(product p1)
    {
        pro.put(p1.id,p1);
        System.out.println("Product added successfully");
    }

    public void removeProduct(product p1)
    {

        if(pro.containsKey(p1.id)){
            pro.remove(p1.id);
        }else
        {
            pro.remove(p1.id);
        }
    }

    public  void ShowProduct()
    {
        if(pro.isEmpty()){
            System.out.println("No item is present");
            return;
        }

        System.out.println("----------------------------------------------");
        System.out.printf("| %-5s | %-10s | %-10s | %-10s |","Id" ," Name","Price ","Quantity");
        System.out.println("----------------------------------------------");
        for(product x:pro.values()) {
           System.out.printf("| %-5s | %-10s | %-10s | %-10s |",x.id,x.name,x.price,x.qty );
         }
        System.out.println("----------------------------------------------");

    }

    public boolean isAvaiable(int p_id,int qty)
    {
        return pro.containsKey(p_id) && pro.get(p_id).qty>=qty;
    }

    public void reduceQuantity(int p_id,int qty)
    {
        if(isAvaiable(p_id,qty)){
            pro.get(p_id).qty-=qty;
        }
    }

}
