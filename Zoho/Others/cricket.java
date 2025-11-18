package Zoho.Others;
import java.util.*;

public class cricket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ex = 0;

        for (int j = 1; j <= 2; j++) {
            System.out.println("Player " + j);
            ArrayList<String> ans = new ArrayList<>();
            int i = 1;

            while (ans.size() < 6) {
                System.out.print("Ball " + i + ": ");
                String x = in.nextLine();

                if (x.equals("w") || x.equals("n")) {
                    ex++;                      // Count as extra
                    System.out.print("Extra ball for " + x + ": ");
                    String extraBall = in.nextLine();  // Take actual run
                    ans.add(extraBall);       // Add only the actual run
                } else {
                    ans.add(x);
                }

                i++;  // move to next ball
            }

            int sum = 0;
            for (String s : ans) {
                try {
                    sum += Integer.parseInt(s);
                } catch (NumberFormatException e) {
                    // ignore invalid entries
                }
            }

            System.out.println("Player " + j + " Run: " + sum);
        }

        System.out.println("Extra: " + ex);
    }
}
