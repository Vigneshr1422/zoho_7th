package ZohoLowLevelDesign.Console.Login_SignUp;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User_Details userDetails = new User_Details();

        while (true) {
            System.out.println("\n1. Sign Up \n2. Login \n3. Exit");
            System.out.print("Choose: ");
            int choice = in.nextInt();
            in.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String newName = in.nextLine().toLowerCase();
                    System.out.print("Enter password: ");
                    String newPass = in.nextLine();

                    if (userDetails.sign_up(newName, newPass)) {
                        System.out.println("User registered successfully ✅");
                    } else {
                        System.out.println("Username already exists ❌");
                    }
                    break;

                case 2:
                    System.out.print("Enter username: ");
                    String name = in.nextLine().toLowerCase();
                    System.out.print("Enter password: ");
                    String pass = in.nextLine();

                    if (userDetails.sign_in(name, pass)) {
                        System.out.println("Login successful ✅");
                    } else {
                        System.out.println("Invalid username or password ❌");
                    }
                    break;

                case 3:
                    System.out.println("Exiting... Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
