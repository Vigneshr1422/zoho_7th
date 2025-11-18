package Zoho.Experience.ZohoPreviousSet.DriveSet.Set23;

public class op_num_opearation {
    public static void main(String[] args) {
        String a="12345*+-";
        int n=a.length();
        int i=0;

        StringBuilder num=new StringBuilder();
        StringBuilder ch=new StringBuilder();

        while(i<n)
        {
            char c=a.charAt(i);
            if(Character.isDigit(c)){
                num.append(c);
            }else {
                ch.append(c);
            }
            i++;
        }

        int start=num.charAt(0)-'1';

        for(int j=0;j<ch.length();j++)
        {
            int nxt=num.charAt(i+1)-'0';
            char op=ch.charAt(i);
            if(op=='+') start+=nxt;
            else if(op=='-') start-=nxt;
            else if(op=='*') start*=nxt;
            else if(op=='/') start/=nxt;
        }

        System.out.println(start);
    }
}
