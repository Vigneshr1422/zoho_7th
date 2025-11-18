package set2;

import java.util.LinkedList;
import java.util.Queue;

public class generateNumber {
    public static void main(String[] args) {
        Queue<String>set=new LinkedList<>();

        int n=10;
        set.add("3");
        set.add("4");
        String ans="";

        for(int i=0;i<n;i++){
            ans=set.poll();
            System.out.println(ans);
            set.add(ans+"3");
            set.add(ans+"4");

        }
        
    }
    
}
