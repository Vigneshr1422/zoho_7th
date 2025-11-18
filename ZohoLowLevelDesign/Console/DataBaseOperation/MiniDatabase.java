package ZohoLowLevelDesign.Console.DataBaseOperation;
import java.util.Scanner;

public class MiniDatabase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyMap current = new MyMap();
        MyStack transactions = new MyStack();

        while (true) {
            System.out.print(
                    "\nEnter a command:\n" +
                            "1: SET <var> <value>\n" +
                            "2: GET <var>\n" +
                            "3: UNSET <var>\n" +
                            "4: COUNT <value>\n" +
                            "5: BEGIN\n" +
                            "6: ROLLBACK\n" +
                            "7: COMMIT\n" +
                            "8: END\n> "
            );

            String line = sc.nextLine().trim();
            if (line.equals("")) continue;

            String[] parts = line.split("\\s+");
            String cmd = parts[0].toUpperCase();

            switch (cmd) {
                case "SET":
                    if (parts.length < 3) {
                        System.out.println("Usage: SET <var> <value>");
                        break;
                    }
                    current.set(parts[1], parts[2]);
                    System.out.println("SET " + parts[1] + " = " + parts[2]);
                    break;

                case "GET":
                    if (parts.length < 2) {
                        System.out.println("Usage: GET <var>");
                        break;
                    }
                    String val = current.get(parts[1]);
                    System.out.println("GET " + parts[1] + " → " + (val == null ? "null" : val));
                    break;

                case "UNSET":
                    if (parts.length < 2) {
                        System.out.println("Usage: UNSET <var>");
                        break;
                    }
                    current.unset(parts[1]);
                    System.out.println("UNSET " + parts[1]);
                    break;

                case "COUNT":
                    if (parts.length < 2) {
                        System.out.println("Usage: COUNT <value>");
                        break;
                    }
                    int cnt = current.count(parts[1]);
                    System.out.println("COUNT " + parts[1] + " → " + (cnt == 0 ? "null" : cnt));
                    break;

                case "BEGIN":
                    transactions.push(current.copy());
                    System.out.println("BEGIN TRANSACTION");
                    break;

                case "ROLLBACK":
                    MyMap prev = transactions.pop();
                    if (prev == null) System.out.println("ROLLBACK → NO TRANSACTION");
                    else {
                        current = prev;
                        System.out.println("ROLLBACK → Transaction reverted");
                    }
                    break;

                case "COMMIT":
                    transactions.clear();
                    System.out.println("COMMIT → All transactions saved");
                    break;

                case "END":
                    sc.close();
                    System.out.println("Exiting database.");
                    return;

                default:
                    System.out.println("Unknown command. Please enter one of the menu options.");
            }
        }
    }
}
