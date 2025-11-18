package leetcode_review;

public class excel {
    public static void main(String[] args) {
        int res=0;
        String str="AB";
        int i=0;
        while(i<str.length())
        {
            char c=str.charAt(i);
            int val=c-'A'+1;
            res=res*26+val;
            i++;
        }

        System.out.println(res);

        ExcelReverse();
    }


    public static void ExcelReverse()

    {
        int n=28;
        StringBuilder ans=new StringBuilder();

        while(n!=0)
        {
            n--;
            int rem=n%26;
            ans.append((char)(rem+'A'));
            n/=26;
        }

        System.out.println(ans.reverse().toString());
    }
    
}
