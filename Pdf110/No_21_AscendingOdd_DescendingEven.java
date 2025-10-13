package Pdf110;

public class No_21_AscendingOdd_DescendingEven {
    public static void main(String[] args) {
        int[] arr = {5, 8, 11, 6, 2, 1, 7};

        sortOddAscEvenDesc(arr);

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    public static void sortOddAscEvenDesc(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // both odd → ascending
                if (arr[i] % 2 != 0 && arr[j] % 2 != 0 && arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                // both even → descending
                else if (arr[i] % 2 == 0 && arr[j] % 2 == 0 && arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                // odd before even → swap if even comes before odd
                else if (arr[i] % 2 == 0 && arr[j] % 2 != 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
