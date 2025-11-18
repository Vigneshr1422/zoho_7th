package ZohoLowLevelDesign.Low_Level_Design.Login_feature_2;
import java.util.*;
public class userList {
    private List<user>details=new ArrayList<>();

    public boolean signup(String name,String password){
        if(check(name)!=null){
            System.out.println("Already user available ");
            return false;
        }
        details.add(new user(name, password));
        return  true;
    }

    public boolean login(String name, String pass){
        user ur=check(name);
        if(ur==null){
            System.out.println("User noy found");
            return false;
        }

        if(ur.getBlock()){
            System.out.println("user is blocked");
            return  false;
        }
        if(ur.getPassword().equals(pass)){
            ur.reAttempt();
            return true;
        }else
        {
            ur.increseAttempt();
            if(ur.getBlock()){
                System.out.println("Already 3 time so out ");
            }else
            {
                System.out.println("wrong password "+(3-ur.getAttempt())+" attempt only");
            }
            return false;

        }
    }

    private  user check(String name){
        for(user ur:details){
            if(ur.getName().equals(name)){
                return  ur;
            }
        }
        return null;
    }

}
