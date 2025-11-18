package array;

import java.util.Scanner;

public class reverse {
     public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Size ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Reverse");
        int temp=0;
      for(int i=0,j=arr.length-1;i<j;i++,j--)
      {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
      }
      for (int i : arr) {
        System.out.println(i+" ");
        
      }
}
}
