package lever3;

import java.util.*;

public class pairArray {
    public static void main(String[] args) {
                int[][] arr = { {20,30}, {12,25}, {12,20}, {2,10}, {15,25}, {25,40}, {40,60} };


                List<int []> chain=new ArrayList<int []>();

                Arrays.sort(arr,new Comparator<int []>() {
                    public int compare(int a[],int b[])
                    {
                        return a[1]-b[1];
                    }
                });
                                    int prev=Integer.MIN_VALUE;


                for(int x[]:arr)
                {

                    if(x[0]>prev){
                        chain.add(x);
                        prev=x[1];
                    }
                }

                System.out.println(chain.size());
                for(int i = 0; i < chain.size(); i++) {
                    int[] p = chain.get(i);
                    System.out.print("{" + p[0] + "," + p[1] + "} ");
        }
        System.out.println();
    }
}
