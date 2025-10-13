package Patters;

public class lookandsay_pattern {
    public static void main(String[] args) {
        int n = 5;  // number of terms
        String a = "1";

        System.out.println(a);

        for(int i=1;i<n;i++)
        {
            int c=1;
            StringBuilder ans=new StringBuilder();

            for(int j=1;j<a.length();j++){
                if(a.charAt(j)==a.charAt(j-1)){
                    c++;
                }else
                {
                    ans.append(c).append(a.charAt(j-1));
                    c=1;
                }
            }

            ans.append(c).append(a.charAt(a.length()-1));
            a=ans.toString();
        System.out.println(a);
        }

    }
}