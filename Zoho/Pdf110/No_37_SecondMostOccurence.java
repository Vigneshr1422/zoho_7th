package Zoho.Pdf110;

import java.util.HashMap;

public class No_37_SecondMostOccurence {
    public static void main(String[] args) {
        HashMap<Integer,Integer>ans=new HashMap<>();
        int []arr={1,1,2,3,1,2,4};

        for(int i:arr)
        {
            ans.put(i, ans.getOrDefault(i,0)+1);
        }
        int firstMax=0;
        int seconddMax=0;

        for(int k: ans.values())
        {
            if(k>firstMax){
                seconddMax=firstMax;
                firstMax=k;
            }
            else if(k!=firstMax && k>seconddMax){
                seconddMax=k;
            }
        }

        for(int i:ans.keySet())
        {
            if(ans.get(i)==seconddMax){
                System.out.println(i);
                break;
            }
        }
    }
}
