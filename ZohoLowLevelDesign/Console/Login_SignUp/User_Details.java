package ZohoLowLevelDesign.Console.Login_SignUp;
import java.util.*;
public class User_Details {
    private List<User> userList=new ArrayList<>();


    public boolean sign_up(String name,String password)
    {
        if(username_check(name)!=null)
        {
            System.out.println("Already present Username ");
            return  false;
        }
        userList.add(new User(name,password));
        return true;
    }
    public boolean sign_in (String name,String password)
    {
        User username=username_check(name);
        if(username !=null && username.call_password().equals(password))
        {
            return  true;
        }
        return false;

    }

    private User username_check(String name)
    {
        for(User user: userList )
        {
            if(user.call_name().equals(name))
            {
                return user;
            }
        }
        return null;
    }
}
