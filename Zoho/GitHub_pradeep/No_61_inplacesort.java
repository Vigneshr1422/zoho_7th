package Zoho.GitHub_pradeep;

public class No_61_inplacesort {
    public static void main(String[] args) {
            int[] arr = {5, 8, 11, 6, 2, 1, 7};

            // Sort in-place
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {

                    // both odd → ascending
                    if (arr[i] % 2 != 0 && arr[j] % 2 != 0 && arr[i] > arr[j]) {
                        swap(arr, i, j);
                    }

                    // both even → descending
                    else if (arr[i] % 2 == 0 && arr[j] % 2 == 0 && arr[i] < arr[j]) {
                        swap(arr, i, j);
                    }

                    // even comes before odd → swap (to move odds to left)
                    else if (arr[i] % 2 == 0 && arr[j] % 2 != 0) {
                        swap(arr, i, j);
                    }
                }
            }

            // print result
            for (int x : arr) {
                System.out.print(x + " ");
            }
        }

        static void swap(int[] a, int i, int j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

