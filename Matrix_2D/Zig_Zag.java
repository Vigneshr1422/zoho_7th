package Matrix_2D;
/*
-------diagonal matrix-----------
            1
            2 4
            3 5 7
            6 8
            9
above is diagonal matrix
-------Zig zag matrix-----------
            1
            2 4
            7 5 3
            6 8
            9
above is Zig zag matrix

 */
public class Zig_Zag {
    public static void main(String[] args) {
        int [][]arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        ZigZag(arr);
    }

    public static void ZigZag(int [][]arr)
    {
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n+m-1;i++)
        {
            if(i%2==0) {
                int r = (i<n)?i:n-1;
                int c = i-r;
                while (r >=0  && c <m) {
                    System.out.print(arr[r][c] + " ");
                    r--;
                    c++;
                }
            }else
            {
                int c = (i<n)?i:m-1;
                int r = i-c;
                while (r< n && c>= 0) {
                    System.out.print(arr[r][c] + " ");
                    r++;
                    c--;
                }
            }
        }
    }
}

