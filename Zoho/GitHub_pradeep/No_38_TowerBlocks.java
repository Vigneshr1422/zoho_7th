package Zoho.GitHub_pradeep;

import java.util.Arrays;
import java.util.Scanner;

public class No_38_TowerBlocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] blocks = new int[6];

        System.out.println("Enter 6 block heights:");
        for (int i = 0; i < 6; i++) {
            blocks[i] = sc.nextInt();
        }

        System.out.println("Enter desired tower heights:");
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();

        // Try all combinations of 3 blocks out of 6
        int[] indices = {0, 1, 2, 3, 4, 5};
        boolean found = false;

        // Simple 3-nested loop to choose 3 blocks for first tower
        for (int i = 0; i < 4 && !found; i++) {
            for (int j = i + 1; j < 5 && !found; j++) {
                for (int k = j + 1; k < 6 && !found; k++) {
                    int sum1 = blocks[i] + blocks[j] + blocks[k];
                    if (sum1 == h1) {
                        // Remaining 3 blocks form tower 2
                        int[] tower1 = {blocks[i], blocks[j], blocks[k]};
                        int[] tower2 = new int[3];
                        int idx = 0;
                        for (int t = 0; t < 6; t++) {
                            if (t != i && t != j && t != k) {
                                tower2[idx++] = blocks[t];
                            }
                        }
                        int sum2 = tower2[0] + tower2[1] + tower2[2];
                        if (sum2 == h2) {
                            Arrays.sort(tower1);
                            Arrays.sort(tower2);
                            System.out.println(Arrays.toString(tower1) + " & " + Arrays.toString(tower2));
                            found = true;
                        }
                    }
                }
            }
        }

        if (!found) {
            System.out.println("No solution possible");
        }
    }
}
