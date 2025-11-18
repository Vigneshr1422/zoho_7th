package set12;
public class big_small_check_matrix{
    public static void main(String[] args) {
        int a[][]={
             {8,5,2},
            {9,7,5}
           
            
        };
        int b[][]={
            {5,2},
            {7,5}
        };

        boolean check=check_funtion(a,b);
        System.out.println(check);
    }
    public static boolean check_funtion(int [][]a,int [][]b){
        int n=a.length;
        int n1=a[0].length;
        int m=b.length;
        int m1=b[0].length;

        for(int i=0;i<=n-m;i++){
            for(int j=0;j<=n1-m1;j++){
                if(function(a,b,i,j)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean function(int a[][],int [][]b,int row, int col){

        int n=b.length;
        int m=b[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[row+i][col+j]!=b[i][j]){return false;}
            }
        }
        return true;
    }
}