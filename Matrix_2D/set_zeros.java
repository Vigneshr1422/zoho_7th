package Matrix_2D;

public class set_zeros {
    public static void main(String[] args) {
        int [][]arr={
                {1,2,3},
                {4,0,6},
                {7,8,9}
        };

        int n=arr.length;
        int m=arr[0].length;
        boolean row=false;
        boolean col=false;

        for(int i=0;i<n;i++)
        {
         if(arr[i][0]==0)
             col=true;
        }

        for(int j=0;j<m;j++)
        {
            if(arr[0][j]==0)
                row=true;
        }

        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(arr[i][j]==0)
                {
                    arr[i][0]=arr[0][j]=0;
                }
            }
        }

        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(arr[i][0]==0 || arr[0][j]==0)
                {
                    arr[i][j]=0;
                }
            }
        }

        if(row)
        {
            for(int j=0;j<m;j++)
            {
                arr[0][j]=0;
            }
        }
        if(col)
        {
            for(int i=0;i<n;i++)
            {
                arr[i][0]=0;
            }
        }

        for(int []arrs: arr)
        {
            for (int k:arrs)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
