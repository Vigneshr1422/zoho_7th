package ZohoLowLevelDesign.Console.Inventary_System;

public class user {

    private String name;
    private String password;
    private String role;

    public user(String name, String password, String role) {
        this.name = name;
        this.password = password;
        this.role = role;
    }
    public String getName(){ return name;}
    public String getPassword(){ return  password ;}
    public String getRole(){ return  role; }
}
