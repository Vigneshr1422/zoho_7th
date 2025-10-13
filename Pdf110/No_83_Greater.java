package Pdf110;

public class No_83_Greater {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 1, 8, 5, 11};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int minGreater = Integer.MAX_VALUE;

            // find smallest number greater than arr[i]
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i] && arr[j] < minGreater) {
                    minGreater = arr[j];
                }
            }

            // print result
            System.out.print(arr[i] + ">");
            if (minGreater != Integer.MAX_VALUE)
                System.out.print(minGreater);
            System.out.print(", ");
        }
    }
}
