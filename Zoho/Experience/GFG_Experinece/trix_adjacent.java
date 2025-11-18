package GFG_Experinece;

public class trix_adjacent {
    public static void main(String[] args) {
        int [][]arr = {
            {1, 0, 1},
            {1, 1, 0},
            {1, 1, 1}
        };
        matrixTransform(arr);
    }

    public static void matrixTransform(int [][]arr) {
        int n = arr.length;
        int m = arr[0].length;

        // Step 1: Mark neighbors of 1 as -1
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                if(arr[i][j] == 1) {
                    if(i>0 && arr[i-1][j]!=1) arr[i-1][j] = -1;       // up
                    if(i<n-1 && arr[i+1][j]!=1) arr[i+1][j] = -1;     // down
                    if(j>0 && arr[i][j-1]!=1) arr[i][j-1] = -1;       // left
                    if(j<m-1 && arr[i][j+1]!=1) arr[i][j+1] = -1;     // right
                }
            }
        }

        // Step 2: Convert all -1 to 0
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] == -1) arr[i][j] = 0;
            }
        }

        // Step 3: Print the final matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
