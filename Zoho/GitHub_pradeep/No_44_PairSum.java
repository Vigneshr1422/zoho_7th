package Zoho.GitHub_pradeep;

public class No_44_PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5, 6};
        int sum = 5;
        int count = 0;

        System.out.println("Pairs with sum " + sum + ":");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    count++;
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
        System.out.println("Total pairs = " + count);
    }
}
