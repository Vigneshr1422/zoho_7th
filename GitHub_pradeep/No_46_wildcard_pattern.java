package GitHub_pradeep;

public class No_46_wildcard_pattern {
    public static void main(String[] args) {
        String a="abc";
        String b="a*";

        System.out.println(isWildCard(a,b));
    }
    public static boolean isWildCard(String text,String pattern)
    {
        int n=text.length();
        int m=pattern.length();

        boolean [][]dp=new boolean[n+1][m+1];

        dp[0][0]=true;

        for(int j=1;j<=m;j++){
            if(pattern.charAt(j-1)=='*'){
                dp[0][j]=dp[0][j-1];
            }
        }

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                char patternCh=pattern.charAt(j-1);
                char textCh=text.charAt(i-1);

                if(patternCh=='?'|| patternCh==textCh){
                    dp[i][j]=dp[i-1][j-1];
                }else if(patternCh=='*')
                {
                    dp[i][j]=dp[i][j-1] || dp[i-1][j];
                }
            }

        }
        return dp[n][m];
    }
}
