package ZohoLowLevelDesign.Console.practice;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Manage ob1 = new Manage();
        while (true) {
            System.out.println("1. SignIn \n2. SignUp\n3. Exit");
            int n = in.nextInt();
            in.nextLine();
            switch (n) {
                case 1:
                    System.out.println("SignIn process");
                    System.out.println("Enter name : ");
                    String name = in.nextLine();
                    System.out.println("Enter password ");
                    String password = in.nextLine();
                    if (ob1.SignInCheck(name, password)) {
                        System.out.println("User sign Successful ");
                    } else {
                        System.out.println("User Sign In not successful ");
                    }
                    break;

                case 2:
                    System.out.println("SignUp Process");
                    System.out.println("Enter username");
                    String nam = in.nextLine();
                    System.out.println("Enter Password ");
                    String pas = in.nextLine();
                    if (ob1.SignUpCheck(nam, pas)) {
                        System.out.println("Login Successful");

                    } else {
                        System.out.println("Invalid password");
                    }
                    break;
                case 3:
                    System.out.println("Exit bye bye ");
                    System.exit(0);
                default:
                    System.out.println("Enter correct number");
            }


        }
    }
}
