package ZohoLowLevelDesign.Low_Level_Design.FileSystem;
import java.util.*;

public class FileExplorer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Directory current = new Directory("home", null);

        while (true) {
            System.out.println("Enter an operation ");
            System.out.println("----------------------");
            System.out.println(
                    """
                            1. Create Directory\s
                            2. Delete Directory
                            3. Change Directory
                            4. Create File
                            5. Remove File
                            6. List All (sort yes/no)
                            7. Search File
                            8. Exit
                            """);
            System.out.println("-----------------------");
            System.out.print("Enter option: ");

            int n = in.nextInt();

            switch (n) {

                case 1:
                    System.out.print("Enter directory name to create: ");
                    String createName = in.next();
                    current.createDirectory(createName);
                    break;

                case 2:
                    System.out.print("Enter directory name to remove: ");
                    String removeName = in.next();
                    current.removeDirectory(removeName);
                    break;

                case 3:
                    System.out.print("Enter directory name (.. to go back): ");
                    String dir = in.next();
                    if (dir.equals("..")) {
                        current = current.moveToParent();
                    } else {
                        current = current.moveToSubDirectory(dir);
                    }
                    System.out.println("Current path: " + current.getPath());
                    break;

                case 4:
                    in.nextLine();
                    System.out.print("Enter file name: ");
                    String fName = in.nextLine();
                    System.out.print("Enter file type (txt/jpeg/mp4): ");
                    String fType = in.next();
                    System.out.print("Enter file size: ");
                    int size = in.nextInt();
                    current.createFile(fName, fType, size);
                    break;

                case 5:
                    System.out.print("Enter file name to remove: ");
                    String fn = in.next();
                    current.removeFile(fn);
                    break;

                case 6:
                    System.out.print("Sort by size? (yes/no): ");
                    String sortInput = in.next();
                    boolean sort = sortInput.equalsIgnoreCase("yes");
                    current.listAll(sort);
                    break;

                case 7:
                    in.nextLine();
                    System.out.print("Enter file name/type to search: ");
                    String searchKey = in.nextLine();
                    current.searchFile(searchKey);
                    break;

                case 8:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
