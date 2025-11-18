package Arrayspractice;
import java.util.*;
public class union_intersections {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter array one size ");
        int n=in.nextInt();

        System.out.println("Enter elements in array one : ");
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=in.nextInt();
        }
    
        System.out.println("Enter array two size ");
        int m=in.nextInt();
        System.out.println("Enter elements in array two : ");
        int arr2[]=new int[m];
        for(int i=0;i<m;i++)
        {
            arr2[i]=in.nextInt();
        }


        int answer[]=union(arr1, arr2);

        System.out.println("The final array hass ");
       for(int c=0;c<answer.length;c++)
       {
        System.out.println(answer[c]+" ");
        in.close();
       }
    }


    public static int[] union (int arr1[],int arr2[])
    {
        int all[] = new int[arr1.length+arr2.length];
      
        int i=0,j=0,k=0;
        while (i<arr1.length && j<arr2.length) {

            if(arr1[i]<arr2[j])
            {
               all[k++]= arr1[i++];
            }
            else if(arr2[j]<arr1[i])
            {
               all[k++]= arr2[j++];
            }
            else{
            all[k++]=arr1[i];
            i++;
            j++;
            }     
        }  
            while (i<arr1.length)
            {
                all[k++]=arr1[i++];

            }   
            while (j<arr2.length)
            {
                all[k++]=arr2[j++];
            }  
        
        int result[]= new int[k];
      for(int x=0;x<k;x++)
      {
        result[x]=all[x];
      }
        return result;
    }
}
