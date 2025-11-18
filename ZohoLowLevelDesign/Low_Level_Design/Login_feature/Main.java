package ZohoLowLevelDesign.Low_Level_Design.Login_feature;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        user_details details=new user_details();

        while(true)
        {
            System.out.println("1.Sign up \n2.Login \n3.Exit ");
            System.out.println("choose");

            int n=in.nextInt();
            in.nextLine();

            switch (n){
                case 1:
                    System.out.println("Enter yur name ");
                    String name=in.nextLine();

                    System.out.println("Enter your password");
                    String password=in.nextLine();

                    if(details.signup(name,password)){
                        System.out.println("user Register succuess");
                    }
                    else
                    {
                        System.out.println("invalid username or password");
                    }
                    break;

                case 2:
                    System.out.println("Enter yur name ");
                    String na=in.nextLine();

                    System.out.println("Enter your password");
                    String ps=in.nextLine();

                    if(details.login(na,ps)){
                        System.out.println("login successfully ");
                    }
                    else
                    {
                        System.out.println("invalid username or password");
                    }
                    break;
                case 3:
                    System.out.println("Exit");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");



            }

        }

    }

}
