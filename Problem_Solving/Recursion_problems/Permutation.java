package Problem_Solving.Recursion_problems;

public class Permutation {
    public static void main(String[] args) {
        String a="ABC";
        Generate(a,"");
    }

    public static void Generate(String a,String ans)
    {
        if(a.isEmpty()){
            System.out.print(ans+" ");
            return;
        }

        for(int i=0;i<a.length();i++)
        {
            char c=a.charAt(i);
            String x=SubStringFun(a,0,i) + SubStringFun(a,i+1,a.length());
            Generate(x,ans+c);
        }

    }

    public static String SubStringFun(String a,int s,int e)
    {String ans="";
        for(int i=s;i<e;i++){
            ans+=a.charAt(i);
        }
    return ans;
    }
}
