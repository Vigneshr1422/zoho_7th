package Zoho.GitHub_pradeep;

public class No_68_LexicographicSort {
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "grape", "cherry"};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) { // lexicographic compare
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Lexicographically sorted words:");
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
