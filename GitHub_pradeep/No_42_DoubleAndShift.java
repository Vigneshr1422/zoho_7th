package GitHub_pradeep;

public class No_42_DoubleAndShift {
   public static void main(String[] args) {
            int[] arr = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8};

            modifyArray(arr);

            // print final output
            for (int n : arr) {
                System.out.print(n + " ");
            }
        }

        static void modifyArray(int[] arr) {
            int n = arr.length;

            // Step 1: Traverse and merge duplicates
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] != 0 && arr[i] == arr[i + 1]) {
                    arr[i] *= 2;   // double current
                    arr[i + 1] = 0; // make next zero
                }
            }

            // Step 2: Shift all non-zero elements to front
            int index = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] != 0) {
                    arr[index++] = arr[i];
                }
            }

            // Step 3: Fill remaining with zeros
            while (index < n) {
                arr[index++] = 0;
            }
        }
    }

