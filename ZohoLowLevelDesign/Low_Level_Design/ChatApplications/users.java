package ZohoLowLevelDesign.Low_Level_Design.ChatApplications;

public class users {
    private final String username;
    private boolean active;

    users(String name, boolean status){
        this.username=name;
        this.active=true;
    }

    public String getUsername() {
        return username;
    }
    public  boolean isActive() {
        return active;
    }


    public void deActive(){
    {
        this.active=false;
        }


    }
}
