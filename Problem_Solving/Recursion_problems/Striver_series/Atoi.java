package Problem_Solving.Recursion_problems.Striver_series;

public class Atoi {
    public static void main(String[] args) {
        String []arr={
                "42"," -42abc","4193 with words","words 987","-91283472332"
        };

        for(String x:arr)
        {
            System.out.println(FunctionAtoi(x));
        }
    }

    public static int FunctionAtoi(String s)
    {
        int i=0;
        int n=s.length();
        int sign=1;
        long ans=0;

        while(i<n && s.charAt(i)==' '){
            i++;
        }
        if(i<n && (s.charAt(i)=='+') || (s.charAt(i)=='-')){
            sign=(s.charAt(i)=='+') ?1:-1;
            i++;
        }
        while (i<n && Character.isDigit(s.charAt(i))){
            int x=s.charAt(i)-'0';
            ans=ans*10+x;
            ans*=sign;
            if(ans<=Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }

            if(ans>=Integer.MAX_VALUE)
            {
                return Integer.MAX_VALUE;
            }
            i++;
        }
        return (int) ans;

    }
}
