package ZohoLowLevelDesign.Console.Login_SignUp;

public class User {

    private String name;
    private String password;

    public User(String name,String password)
    {
        this.name=name;
        this.password=password;
    }

    public String call_name()
    {
        return name;
    }

    public String call_password()
    {
        return password;
    }
}
