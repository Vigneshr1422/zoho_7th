package Zoho.Experience.GFG_Experinece;

import java.util.Stack;

public class SubString_Stack {
    public static void main(String[] args) {
        String s="(skeeg(for)skeeg)";

        Stack<Character>st=new Stack<>();

        for(char x:s.toCharArray())
        {
            if(x!=')'){
                st.add(x);
            }else{
                StringBuilder store=new StringBuilder();
                while(!st.isEmpty() && st.peek()!='('){
                    store.append(st.pop());
                }

                st.pop();
                for(char d:store.toString().toCharArray()){
                    st.add(d);
                }
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
            
        }

        System.out.println(ans.reverse().toString());
    }
    
}
