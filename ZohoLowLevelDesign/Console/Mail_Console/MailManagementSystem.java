package ZohoLowLevelDesign.Console.Mail_Console;

import java.util.*;

public class MailManagementSystem {
    private List<Mail> mails;
    private Set<String> spamWords;
    private Scanner in;

    public MailManagementSystem() {
        mails = new ArrayList<>();
        spamWords = new HashSet<>(Arrays.asList("lottery", "winner", "prize", "free"));
        in = new Scanner(System.in);
    }

    public void storeMail() {
        System.out.print("Enter Sender Mail: ");
        String sender = in.nextLine();
        System.out.print("Enter Receiver Mail: ");
        String receiver = in.nextLine();
        System.out.print("Enter Subject: ");
        String subject = in.nextLine();
        System.out.print("Enter Content: ");
        String content = in.nextLine();

        Mail mail = new Mail(sender, receiver, subject, content);
        checkSpam(mail);
        mails.add(mail);
        System.out.println("Mail stored successfully!\n");
    }

    public void deleteMail() {
        System.out.print("Enter mail index to delete: ");
        int index = safeReadIndex();
        if (isValidIndex(index)) {
            mails.remove(index);
            System.out.println("Mail deleted successfully!");
        } else {
            System.out.println("Invalid mail index.");
        }
    }

    public void addTag() {
        System.out.print("Enter mail index: ");
        int index = safeReadIndex();
        if (isValidIndex(index)) {
            System.out.print("Enter tag: ");
            String tag = in.nextLine();
            mails.get(index).addTag(tag);
            System.out.println("Tag added successfully!");
        } else {
            System.out.println("Invalid mail index.");
        }
    }

    public void showStats() {
        System.out.println("\n--- Mail Statistics ---");
        System.out.println("Total mails: " + mails.size());

        System.out.print("Enter the number of recent mails to show: ");
        int n = safeReadIndex();

        System.out.println("\nRecent " + n + " Mails:");
        mails.stream()
                .skip(Math.max(0, mails.size() - n))
                .forEach(System.out::println);

        long spamCount = mails.stream().filter(Mail::isSpam).count();
        System.out.println("Spam mails count: " + spamCount);
    }

    public void searchMail() {
        System.out.print("Enter keyword to Problem_Solving.search (subject/content): ");
        String keyword = in.nextLine().toLowerCase();

        mails.stream()
                .filter(mail -> mail.getSubject().toLowerCase().contains(keyword) ||
                        mail.getContent().toLowerCase().contains(keyword))
                .forEach(System.out::println);
    }

    public void filterByTag() {
        System.out.print("Enter tag to filter: ");
        String tag = in.nextLine().toLowerCase();

        mails.stream()
                .filter(mail -> mail.getTags().stream()
                        .anyMatch(t -> t.equalsIgnoreCase(tag)))
                .forEach(System.out::println);
    }

    private void checkSpam(Mail mail) {
        String content = mail.getContent().toLowerCase();
        for (String word : spamWords) {
            if (content.contains(word)) {
                mail.setSpam(true);
                break;
            }
        }
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index < mails.size();
    }

    private int safeReadIndex() {
        try {
            return Integer.parseInt(in.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public void displayMenu() {
        System.out.println("\nMail Management System");
        System.out.println("1. Store Mail");
        System.out.println("2. Delete Mail");
        System.out.println("3. Add Tag");
        System.out.println("4. Show Statistics");
        System.out.println("5. Search Mail");
        System.out.println("6. Filter By Tag");
        System.out.println("7. Exit");
        System.out.print("Enter Your Choice: ");
    }

    public static void main(String[] args) {
        MailManagementSystem system = new MailManagementSystem();
        int choice;

        do {
            system.displayMenu();
            choice = system.safeReadIndex();
            switch (choice) {
                case 1 -> system.storeMail();
                case 2 -> system.deleteMail();
                case 3 -> system.addTag();
                case 4 -> system.showStats();
                case 5 -> system.searchMail();
                case 6 -> system.filterByTag();
                case 7 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 7);

        system.in.close();
    }
}

//package ZohoLowLevelDesign.Console.Mail_Console;
//import java.util.*;
//public class MailManagementSystem {
//    private List<Mail> mails;
//    private Set<String> spamWords;
//    private Scanner in;
//
//    public MailManagementSystem()
//    {
//        mails=new ArrayList<>();
//        spamWords=new HashSet<>(Arrays.asList("Lottery","winner","prize","free"));
//        in=new Scanner(System.in);
//    }
//
//    public void storeMail(){
//        System.out.println("Enter Sender Mail : ");
//        String sender= in.nextLine();
//        System.out.println("Enter receiver Mail: ");
//        String receiver=in.nextLine();
//        System.out.println("Enter Subject: ");
//        String subject=in.nextLine();
//        System.out.println("Enter a content: ");
//        String content=in.nextLine();
//
//        Mail mail=new Mail(sender,receiver,subject,content);
//        checkSpam(mail);
//        mails.add(mail);
//        System.out.println("Mail stored Successfully ! ");
//    }
//
//    public void deleteMail()
//    {
//        System.out.println("Enter Mail index to delete: ");
//        int index=in.nextInt();
//        in.nextLine();
//        if(index>=0 && index<mails.size()) {
//            mails.remove(index);
//            System.out.println("Delete successfully ! ");
//        }else {
//            System.out.println("Invalid mail index ");
//        }
//    }
//
//    public void addTag()
//    {
//        System.out.println("Enter mail index: ");
//        int index=in.nextInt();
//        in.nextLine();
//        if(index>=0 && index<mails.size()) {
//            System.out.println("Enter tag ");
//            String tag=in.nextLine();
//            mails.get(index).addTag(tag);
//            System.out.println("Delete successfully ! ");
//        }else {
//            System.out.println("Invalid mail index ");
//        }
//    }
//
//    public void showStats()
//    {
//        System.out.println("\n Mail Statistics: ");
//        System.out.println("\nTotal mails: " + mails.size());
//        System.out.println("Enter the number of recent mails to show: ");
//
//        int n = 0;
//        try {
//            n = Integer.parseInt(in.nextLine());
//        } catch (NumberFormatException e) {
//            System.out.println("Invalid number! Showing 0 mails.");
//            return;
//        }
//
//        System.out.println("\nRecent " + n + " Mails: ");
//        mails.stream()
//                .skip(Math.max(0, mails.size() - n))
//                .forEach(System.out::println);
//    }
//
//
//    private void checkSpam(Mail mail)
//    {
//        String content=mail.getContent().toLowerCase();
//        for(String word : spamWords){
//            if(content.contains(word)){
//                mail.setSpam(true);
//                break;
//            }
//        }
//    }
//
//    public void displayMenu(){
//        System.out.println("\nMail Management System ");
//        System.out.println("1. Store Mail ");
//        System.out.println("2. Delete Mail ");
//        System.out.println("3. Add tag");
//        System.out.println("4. Show Statistics");
//        System.out.println("5.Exit");
//        System.out.println("Enter Your Choice: ");
//    }
//
//
//    public static void main(String[] args) {
//        MailManagementSystem system=new MailManagementSystem();
//        int choice;
//
//        do{
//            system.displayMenu();
//            choice =system.in.nextInt();
//            system.in.nextLine();
//            switch (choice)
//            {
//                case 1:
//                    system.storeMail();
//                    break;
//                case 2:
//                    system.deleteMail();
//                    break;
//                case 3:
//                    system.addTag();
//                    break;
//                case 4:
//                    system.showStats();
//                    break;
//                case 5:
//                    System.out.println("Exit ");
//                    break;
//                default:
//                    System.out.println("Invalid option");
//            }
//        } while (choice!=5);
//            system.in.close();
//
//    }
//
//
//
//}
