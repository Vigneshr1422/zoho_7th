package GitHubQuestions;

public class a6_a39_knights_chessboard {
    public static void main(String[] args) {
        int arr[][]={
            {0,1,0,0,0},
            {0,0,0,1,0},
            {1,0,0,0,0},
            {0,0,1,0,0},
            {0,0,0,0,1}
        };
        int n=arr.length;
        int m=arr[0].length;

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    if(isAttack(arr,i,j)){
                        System.out.println("Invalid");
                        return;
                    }
                }
            }
        }
        System.out.println("Superr"); // means valid
    }

    public static boolean isAttack(int [][]arr,int i,int j) {
        int row[]={2,2,-2,-2,1,1,-1,-1};
        int col[]={1,-1,1,-1,2,-2,2,-2};

        for(int k=0;k<8;k++){
            int rr=i+row[k];
            int cc=j+col[k];

            if(rr>=0 && rr<5 && cc>=0 && cc<5 && arr[rr][cc]==1) {
                return true;
            }
        }
        return false;
    }
}
