package Pdf110;
import java.util.*;
public class No_96_CountCharsOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int total = 0;
        int len = 1;
        int start = 1;

        while(start <= n){
            int end = start * 10 - 1;
            if(end > n) end = n;
            total += (end - start + 1) * len;
            len++;
            start *= 10;
        }

        System.out.println("Total characters written: " + total);
    }
}
