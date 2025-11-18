package Matrix_2D;

public class Saddle_point_Matrix {
    public static void main(String[] args) {
        int [][]arr={
                {4,6,12},
                {2,8,14},
                {1,3,6}
        };

        System.out.println(SaddleFunction(arr));
    }
    public static int SaddleFunction(int [][]arr)
    {
        int n=arr.length;
        int m=arr[0].length;
        boolean check=false;

        for (int[] ints : arr) {
            int val = ints[0];
            int colIndex = 0;

            // find minimum value
            for (int j = 1; j < m; j++) {
                if (ints[j] < val) {
                    val = ints[j];
                    colIndex = j;
                }
            }

            boolean saddle = true;


            for (int j = 0; j < m; j++) {
                if (val < arr[j][colIndex]) {
                    val = ints[colIndex];
                    saddle = false;
                    break;
                }
            }
            if (saddle) {
                return val;
            }
        }
        return -1;
    }
}

