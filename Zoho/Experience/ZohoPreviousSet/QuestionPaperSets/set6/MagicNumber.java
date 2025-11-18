package set6;
import java.util.*;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // if(isMagic(n)) {
        //     System.out.println("Magic Number");
        // } else {
        //     System.out.println("Not a Magic Number");
        // }

        for(int i=0;i<n;i++)
        {
            if(isMagic(i)){
                System.out.println(i+" ");
            }
        }
    }

    public static boolean isMagic(int n) {
        n = Math.abs(n);  // handle negatives safely
        int cube = n * n * n;

        int[] a1 = new int[10];
        int[] a2 = new int[10];

        int temp = n;
        while(temp > 0) {
            a1[temp % 10]++;
            temp /= 10;
        }

        temp = cube;
        while(temp > 0) {
            a2[temp % 10]++;
            temp /= 10;
        }

        for(int i = 0; i < 10; i++) {
            if(a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }
}
