package Zoho.Patters;

import java.util.*;

public class MultipleTriangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int t = 1; t <= N; t++) { // print N triangles
                // print spaces
                for (int s = 1; s <= N - i; s++) {
                    System.out.print(" ");
                }
                // print stars
                for (int star = 1; star <= 2 * i - 1; star++) {
                    System.out.print("*");
                }
                // gap between triangles
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
