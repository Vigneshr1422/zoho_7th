package Zoho.Others;

import java.util.*;

public class sum_of_rectange {
    public static void main(String[] args) {
        int [][]arr=new int[5][5];
        Scanner in=new Scanner(System.in);

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("start -> Enter i and  j");
        int x=in .nextInt();
        in.nextLine();
        int y=in.nextInt();

        int []start={x,y};
        System.out.println("end -> Enter i and  j");
        int xx=in .nextInt();
        in.nextLine();
        int yy=in.nextInt();

        int []end={xx,yy};

        System.out.println("End "+Arrays.toString(end));
        System.out.println("Start"+ Arrays.toString(start));

        int sum=0;
        for(int i=x;i<xx;i++)
        {
            for(int j=y;j<yy;j++)
            {
                sum+=arr[i][j];
            }
        }

        System.out.println(sum);
    }
}
