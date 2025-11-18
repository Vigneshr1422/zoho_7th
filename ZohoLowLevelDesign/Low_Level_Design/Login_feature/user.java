package ZohoLowLevelDesign.Low_Level_Design.Login_feature;

public class user {
    private  String name;
    private String password;

    public user(String name,String password){
        this.name=name;
        this.password=password;
    }

    public String getName(){
        return name;
    }
    public String getPassword(){
        return  password;
    }
}
