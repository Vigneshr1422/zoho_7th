package GitHub_pradeep;

public class No_26_SortByFactors {
        public static void main(String[] args) {
            int[] arr = {6, 8, 3, 12};
            int n = arr.length;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (countFactors(arr[i]) < countFactors(arr[j])) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            for (int x : arr) System.out.print(x + " ");
        }

        static int countFactors(int num) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) count++;
            }
            return count;
        }
    }