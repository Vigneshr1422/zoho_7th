package Zoho.GitHub_pradeep;

public class No_115_Integer_English {
    private static final String[] twenty = { "", "One", "Two",
            "Three", "Four", "Five",
            "Six", "Seven", "Eight",
            "Nine", "Ten", "Eleven",
            "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen"};

    private static final String[] tens = {"", "Ten", "Twenty", "Thirty",
            "Forty", "Fifty", "Sixty", "Seventy",
            "Eighty", "Ninety"};

    private static final String[] thousand = {"", "Thousand", "Million", "Billion"};

    public static void main(String[] args) {
        int n=15855;

        String ans=IntFunction(n);
        System.out.println(ans);

    }
    public static String IntFunction(int n)
    {
        if(n==0){
            return "Zero";
        }
        int i=0;
        String ans="";
        while(n!=0)
        {
            if(n%1000!=0){
                ans=function(n%1000)+thousand[i]+" "+ans;
            }
            n/=1000;
            i++;
        }
        return ans;
    }

    public static String function(int n)
    {
        if(n==0) return "";
        else if(n<20){
            return twenty[n];
        }
        else if(n<100){
            return  tens[n/10]+" Hundred " + function(n%10);

        }
        else
        {
            return twenty[n/100]+" Hundred "+function(n%100);
        }
    }
}
