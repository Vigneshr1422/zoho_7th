package GitHubQuestions;

public class a6_a2_MatrixDiagonalSumOptimal {
    public static void main(String[] args) {
        int [][]arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int n=arr.length;
        int m=arr[0].length;
        int lower=0;
        int upper=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i+j<n-1)
                upper+=arr[i][j];
               else if(i+j>n-1)
                lower+=arr[i][j];
                else{
                lower+=arr[i][j];
                upper+=arr[i][j];
                }
            }
        }

        System.out.println(Math.max(lower, upper));


    }
    
}
