package Zoho.Experience.Zoho_Images.ImageSet1;

public class BoxesFill {
    public static void main(String[] args) {
        int[] elements = {10, 8, 1, 4, 9, 2, 7, 5, 6, 3, 1, 3, 9, 10, 4, 2};
        int n=3;
        int k=16;
        int [][]arr={
                {3,3},
                {2,3},
                {1,3}
        };
        int index=0;

        for(int i=0;i<n;i++)
        {
            int row=arr[i][0];
            int col=arr[i][1];


            for(int r=0;r<row;r++)
            {
                for(int c=0;c<col;c++ )
                {
                    if(index<k){
                        System.out.print(elements[index++]+" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
