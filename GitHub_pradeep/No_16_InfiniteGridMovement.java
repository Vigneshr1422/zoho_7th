package GitHub_pradeep;

import java.util.*;

public class No_16_InfiniteGridMovement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();

        String[] moves = sc.nextLine().trim().split(" ");

        for (int i = 0; i < moves.length; i++) {
            switch (moves[i].charAt(0)) {
                case 'U': x--; break;
                case 'D': x++; break;
                case 'L': y--; break;
                case 'R': y++; break;
            }
        }

        System.out.println(x + " " + y);
    }
}
