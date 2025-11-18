package ZohoLowLevelDesign.Low_Level_Design.Login_feature;
import java.util.*;
public class user_details {
    private List<user>list=new ArrayList<>();

    // new user

    public boolean signup(String name, String password){
        if(cheackUser(name)!=null){
            System.out.println("Already user exist");
            return false;
        }
        list.add(new user(name,password));
        return true;
    }

    public boolean login(String name, String password){
        user u=cheackUser(name);
        if(u!=null && u.getPassword().equals(password)){
            return true;
        }
        return false;

    }

    private user cheackUser(String name){
        for(user u:list){
            if(u.getName().equals(name)){
                return u;
            }
        }
        return null;
    }

}
