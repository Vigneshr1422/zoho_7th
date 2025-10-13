package GitHub_pradeep;

public class No_84_rowCol_Unique {
    public static void main(String[] args) {
        int [][]arr = {
                {1, 0, 0, 1},
                {1, 0, 0, 1},
                {0, 1, 1, 0},
                {1, 1, 0, 0}
        };
        function(arr);
    }
    public static void function(int [][]arr)
    {
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++)
        {
            boolean isFull=false;

            for(int j=0;j<i;j++)
            {
               boolean isCheck=true;

               for(int k=0;k<m;k++)
               {
                   if(arr[i][k]!=arr[j][k]){
                       isCheck=false;
                       break;
                   }
               }
               if(isCheck){
                   isFull=true;
               }

            }

            if(!isFull) {
                for (int k = 0; k < m; k++) {
                    System.out.print(arr[i][k]+" ");
                }
                System.out.println();
            }

        }
    }
}
