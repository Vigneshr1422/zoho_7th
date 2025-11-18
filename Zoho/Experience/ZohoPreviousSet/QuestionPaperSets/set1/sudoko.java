public class sudoko {
    /*
      o(1) and o(1)
     */
    public static void main(String[] args) {
        int arr[][]={
                    {5,3,4,6,7,8,9,1,2},
                    {6,7,2,1,9,5,3,4,8},
                    {1,9,8,3,4,2,2,6,7},
                    {8,5,9,7,6,1,4,2,3},
                    {4,2,6,8,5,3,7,9,1},
                    {7,1,3,9,2,4,8888,5,6},
                    {9,6,1,5,3,7,2,8,4},
                    {2,8,7,4,1,9,6,3,5},
                    {3,4,5,2,8,6,1,7,9}

        };

        if(function(arr))
        {
            System.out.println("Valid");
        }else{
            System.out.println("Not Valid");
        }
    }

    public static boolean function(int [][]arr)
    {
  if (arr == null || arr.length != 9) return false;
        for(int i=0;i<9;i++)
        {
            boolean []row=new boolean[9];
            boolean []col=new boolean[9];
            for(int j=0;j<9;j++)
            {
                if(!check(row,arr[i][j])){
                    return false;
                }

                if(!check(col,arr[j][i])){
                    return false;
                }

            }
        }

        for(int i=0;i<9;i+=3)
        {
            for(int j=0;j<9;j+=3)
            {
                boolean []a=new boolean[9];

                for(int row=i;row<i+3;row++)
                {
                    for(int col=j;col<j+3;col++)
                    {
                        if(!check(a,arr[row][col]))
                        {
                            return false;
                        }

                    }
                }
            }

        }


        return true;
    }


    public static boolean check(boolean[] x, int val){
        if(val<1 || val >9){
            return false;
        }
        if(x[val-1]){
            return false;
        }
        x[val-1]=true;
        return true;
    }
    
}
