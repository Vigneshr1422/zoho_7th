package Pdf110;

public class No_42_Evaluate_Expression {
    public static void main(String[] args) {
        String a = "2^2+2!";
        System.out.println(FunctionExpression(a));
    }

    public static int FunctionExpression(String a) {
        int ans=0;
        int i=0;

        while (i<a.length())
        {
            StringBuilder sb=new StringBuilder();
            while(i<a.length() && Character.isDigit(a.charAt(i))){
                sb.append(a.charAt(i));
                i++;
            }
            int val=Integer.parseInt(sb.toString());

            if(i<a.length())
            {
                char op=a.charAt(i);

                if(op=='!'){
                    val=factFun(val);
                    i++;
                }else if(op=='^'){
                    i++;
                    StringBuilder sb1=new StringBuilder();
                    while(i<a.length() && Character.isDigit(a.charAt(i))){
                        sb1.append(a.charAt(i));
                        i++;
                    }
                    int expo=Integer.parseInt(sb1.toString());
                    val=power(val,expo);
                }
            }
            ans+=val;
            if(i<a.length() && a.charAt(i)=='+') i++;
        }
        return ans;
    }
    public static int power(int a,int b)
    {
        int ans=1;
        for(int i=0;i<b;i++)
        {
            ans=ans*a;
        }
        return ans;
    }
    public static int factFun(int a)
    {
        int ans=1;
        for(int i=2;i<=a;i++){
            ans*=i;
        }
        return ans;
    }
}
