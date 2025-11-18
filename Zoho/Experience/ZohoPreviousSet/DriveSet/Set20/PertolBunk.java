package Zoho.Experience.ZohoPreviousSet.DriveSet.Set20;

public class PertolBunk {
    public static void main(String[] args) {
        int [][]arr={
                {4, 6},
                {6, 5},
                {7, 3},
                {4, 5}
        };
        FunctionBunk(arr);
    }
    public static void FunctionBunk(int [][]arr){
        int totalPetrol=0;
        int currPetrol=0;
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            int pump=arr[i][0];
            int dist=arr[i][1];

            int d=pump-dist;

            totalPetrol+=d;
            currPetrol+=d;

            if(currPetrol<0)
            {
               ans=i+1;
               currPetrol=0;
            }
        }
        System.out.println(totalPetrol>=0 ? ans:-1);
    }
}
