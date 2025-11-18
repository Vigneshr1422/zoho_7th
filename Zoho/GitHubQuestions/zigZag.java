package GitHubQuestions;

public class zigZag {
    public static void main(String[] args) {
        int [][]arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        zigzagFunction(arr);
    }

    public static void zigzagFunction(int [][]arr){
        int n=arr.length;
        int m=arr[0].length;

        for(int i=0;i<n+m-1;i++){
            if(i%2==0){
                // even diagonal -> bottom to top
                int row = Math.min(i, n-1);
                int col = i - row;
                while(row>=0 && col<m){
                    System.out.print(arr[row][col] + " ");
                    row--;
                    col++;
                }
            }
            else {
                // odd diagonal -> top to bottom
                int col = Math.min(i, m-1);
                int row = i - col;
                while(row<n && col>=0){
                    System.out.print(arr[row][col] + " ");
                    row++;
                    col--;
                }
            }  
        }
    }
}
