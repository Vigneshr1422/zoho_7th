package GitHubQuestions;

import java.util.*;

public class frequency {
    public static void main(String[] args) {
        int []arr={2,3,7,2,1,3,1};
       bruteforce(arr);
        // optimal(arr);
    }


    public static void optimal(int []arr){
        HashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int i:arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(int k:map.keySet()){
            System.out.println(k+" ->" +map.get(k));

        }

    }
    public static void bruteforce(int []arr){
        int n=arr.length;

        boolean check[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(check[i]){
                continue;  
            }
            int c=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    c++;
                    check[j]=true;
                }
            }
            System.out.println(arr[i]+"-> "+c);
        }
    }
}
