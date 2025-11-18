//package ZohoLowLevelDesign.Console.Inventary_System;
//
//import java.util.*;
//
//public class main {
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        inventory ob1=new inventory();
//        admin admin_=new admin();
//        user_ us=new user_();
//        Manage_user auth=new Manage_user();
//
//        while(true)
//        {
//            System.out.println("Welcome to Inventory Management ");
//
//            System.out.println("\n1.Sign in \n2.Sign Up");
//            int n=in.nextInt();
//            in.nextLine();
//            switch (n)
//            {
//                case 1:
//                    System.out.println("Enter signin Process");
//                    System.out.println("Enter name");
//                    String name=in.nextLine();
//                    System.out.println("Enter Password ");
//                    String password=in.nextLine();
//                    System.out.println("Enter role ");
//                    String role=in.nextLine();
//                    if(auth.signIn(name,password,role))
//                    {
//                        System.out.println("signin success -> go to sign Up ");
//                    }else
//                    {
//                        System.out.println("UserName already Exist");
//                    }
//                    break;
//                case 2:
//                    System.out.println("Enter username ");
//                    String nae=in.nextLine();
//                    System.out.println("Enter password");
//                    String pas=in.nextLine();
//                   Manage_user x= auth.signUp(nae,pas);
//                    if (x == null) {
//                        System.out.println("Invalid credentials.");
//                   else {
//                    System.out.println("Welcome, " + user.getUsername() + " (" + user.getRole() + ")");
//                    if (x.getRole().equals("admin")) {
//                        handleAdmin(sc, inventory);
//                    } else {
//                        handleUser(sc, inventory);
//                    }
//                    break;;
//                            case 3:
//                                System.out.println("Exiting...");
//                                sc.close();
//                                System.exit(0);
//
//                            default:
//                                System.out.println("Invalid choice.");
//                }
//            }
//        }
//    }
//}

package ZohoLowLevelDesign.Console.Inventary_System;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        inventory ob1 = new inventory();
        admin admin_ = new admin(); // pass inventory to admin
        user_ us = new user_();      // pass inventory to user
        Manage_user auth = new Manage_user();

        while (true) {
            System.out.println("Welcome to Inventory Management");
            System.out.println("\n1.Sign Up\n2.Sign In\n3.Exit");
            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter name:");
                    String newName = in.nextLine();
                    System.out.println("Enter password:");
                    String newPassword = in.nextLine();
                    System.out.println("Enter role (admin/user):");
                    String newRole = in.nextLine();   // user default mentio

                    if (auth.signUp(newName, newPassword, newRole)) {
                        System.out.println("Sign up successful!");
                    } else {
                        System.out.println("User already exists.");
                    }
                    break;

                case 2:
                    System.out.println("Enter name:");
                    String loginName = in.nextLine();
                    System.out.println("Enter password:");
                    String loginPassword = in.nextLine();

                    user userObj = auth.signIn(loginName, loginPassword);
                    if (userObj != null) {
                        System.out.println("Welcome, " + userObj.getName() + " (" + userObj.getRole() + ")");
                        if (userObj.getRole().equalsIgnoreCase("admin")) {
                            admin_.adminDetails();
                        } else {
                            us.userDetails();
                        }
                    } else {
                        System.out.println("Invalid credentials. Please try again.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    in.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}