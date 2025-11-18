package GitHubQuestions;
import java.util.*;
public class a6_a3Arrays_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of arrays: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        int[][] arr = new int[n][];
        for(int i=0; i<n; i++){
            System.out.print("Enter number of elements in array " + i + ": ");
            int m = sc.nextInt();
            arr[i] = new int[m];
            System.out.print("Enter " + m + " elements: ");
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum=0;
        for(int [] a:arr)
        {
            int toatl=0;
            for(int i=0;i<a.length;i++){
                toatl=toatl*10+a[i];
            }
            sum+=toatl;
        }

        System.out.println(sum);
    }
    
}
