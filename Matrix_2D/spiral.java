package Matrix_2D;

import java.util.ArrayList;

// spiral
public class spiral {
    public static void main(String[] args) {
        int [][]arr={
                {1,2,3},
                {4,5,6},
                {8,9,10}
        };

        int n=arr.length;
        int m=arr[0].length;
        int top=0;
        int bottom=n-1;

        int left=0;
        int right=m-1;

        ArrayList<Integer>ans=new ArrayList<>();
        while(left<=right && top <=bottom)
        {
            for(int i=left;i<=right;i++)
            {
                ans.add(arr[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++)
            {
                ans.add(arr[i][right]);
            }
            right--;

            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    ans.add(arr[i][left]);
                }
                left++;
            }
        }
        System.out.println(ans);
    }
}
