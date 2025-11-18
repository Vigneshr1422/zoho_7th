package ZohoLowLevelDesign.Low_Level_Design.Login_feature_2;

public class user {
    private String name;
    private String password;
    private int attempt;
    private boolean block;

    public user( String name,String password)
    {
        this.name=name;
        this.password=password;
        this.attempt=0;
        this.block=false;
    }
    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }
    public  void increseAttempt(){
        attempt++;
        if(attempt>=3){
            block=true;
        }
    }

    public  void reAttempt(){
        attempt=0;
    }

    public int getAttempt() {
        return attempt;
    }
    public boolean getBlock(){
        return  block;
    }
}
