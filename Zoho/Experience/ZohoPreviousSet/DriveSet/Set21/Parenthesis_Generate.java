package Zoho.Experience.ZohoPreviousSet.DriveSet.Set21;
import java.util.*;
/*
["((()))", "(()())", "(())()", "()(())", "()()()"]
*/
public class Parenthesis_Generate {
    public static void main(String[] args) {
        int n=3;
        List<String>ans=new ArrayList<>();
        String store="";
        int s=0;
        int e=0;

        GenerateFunction(store,s,e,ans,n);
        System.out.println(ans);

    }
    public static void GenerateFunction(String store,int start,int end, List<String>ans,int n){
        if(store.length()==n*2){
            ans.add(store);
            return;
        }
        if(start<n){
            GenerateFunction(store+"(",start+1,end,ans,n);
        }
        if(end<start){
            GenerateFunction(store+")",start,end+1,ans,n);
        }
    }
}
