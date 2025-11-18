package Matrix_2D;

 public class MatrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int target = 29;
        int n = matrix.length;
        
        int row = 0, col = n - 1;
        boolean found = false;
        
        while (row < n && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.println("Found at: (" + row + ", " + col + ")");
                found = true;
                break;
            } else if (matrix[row][col] > target) {
                col--; // move left
            } else {
                row++; // move down
            }
        }
        
        if (!found) {
            System.out.println("Not found");
        }
    }
}
