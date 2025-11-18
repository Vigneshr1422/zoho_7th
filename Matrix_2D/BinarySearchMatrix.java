package Matrix_2D;

public class BinarySearchMatrix {
    public static boolean search(int[][] mat, int x) {
        int m = mat.length, n = mat[0].length;
        int low = 0, high = m * n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int val = mat[mid / n][mid % n];

            if (val == x) {
                System.out.println("Found at (" + (mid / n) + "," + (mid % n) + ")");
                return true;
            }
            else if (val < x) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1,3,5},
            {7,9,11},
            {13,15,17}
        };
        search(mat, 9);  
    }
}
