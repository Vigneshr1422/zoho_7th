package set2;

public class unbalance_paranthesis {
    public static void main(String[] args) {
        String a="(((ab)";

        StringBuilder x=new StringBuilder();
        int c=0;
        for(int i=0;i<a.length();i++)
        {
            char s=a.charAt(i);

            if(s=='('){
                c++;
                x.append(s);
            }else if(s==')')
            {
                if(c>0){
                c--;
                x.append(s);
                }
            }else

            {
                x.append(s);

            }
        }
        System.out.println(x);
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);

            if(ch=='(' && c>0)
            {
                c--;
            }else{
                ans.append(ch);
            }
        }

        System.out.println(ans.toString());

        
    }
    
}
