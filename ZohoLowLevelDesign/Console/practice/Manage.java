package ZohoLowLevelDesign.Console.practice;
import java.util.*;
public class Manage {

    private List<details> users=new ArrayList<>();
    public boolean SignInCheck(String name,String password)
    {
        if(verify(name)!=null)
        {
            System.out.println("Already name is present ");
            return false;
        }
        users.add(new details(name,password));
        return true;

    }
    public boolean SignUpCheck (String name,String password)
    {
        details var=verify(name);
        if(var!=null && var.getPassword().equals(password)){
            return true;
        }

        return false;
    }

    private details verify(String name)
    {
        for(details userdetails:users )
        {
            if(userdetails.getName().equals(name)){
                return userdetails;
            }
        }
        return null;
    }

}
