package Zoho.GitHub_pradeep;

public class No_67_LargestNumber {
    public static void main(String[] args) {
        String[] arr = {"54", "546", "548", "60"};

        // Simple bubble sort using custom logic
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                String xy = arr[i] + arr[j];
                String yx = arr[j] + arr[i];
                if (xy.compareTo(yx) < 0) { // swap if yx > xy
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Largest number: ");
        for (String s : arr) {
            System.out.print(s);
        }
        System.out.println();
    }
}