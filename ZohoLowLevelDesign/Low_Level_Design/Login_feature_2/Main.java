package ZohoLowLevelDesign.Low_Level_Design.Login_feature_2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        userList url=new userList();

        while(true){
            System.out.println("1.sign up\n2.Login\n3.exit");
            int n=in.nextInt();
            in.nextLine();

            switch (n){
                case 1:
                    System.out.println("Enter the name ");
                    String name=in.nextLine();
                    System.out.println("Enter your password");
                    String pass=in.nextLine();

                    if(url.signup(name,pass)){
                        System.out.println("User added succuess ");
                    }else
                    {
                        System.out.println("Error to save password");
                    }
                    break;

                case 2:
                    System.out.println("Enter the name ");
                    String na=in.nextLine();
                    System.out.println("Enter your password");
                    String pa=in.nextLine();

                    if(url.login(na,pa)){
                        System.out.println("login succuess ");
                    }
                    break;
                case 3:
                    System.out.println("Exit");
                    System.exit(0);
                default:
                    System.out.println("Enter a valid number");
                    break;
            }
        }
    }
}
