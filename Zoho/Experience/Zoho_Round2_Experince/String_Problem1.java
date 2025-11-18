package Zoho.Experience.Zoho_Round2_Experince;
/*
Problem Statement

You are given a string s. Whenever the character 'i' or 'I' appears in the string:

Remove the character before it (if it exists and is not a space).

Remove the 'i' / 'I' itself.

Remove the character after it (if it exists and is not a space).

Spaces should never be removed.

The resulting string should not contain leading spaces.


 */
public class String_Problem1 {
    public static void main(String[] args) {
        String a = "this is my name";
        StringBuilder ans=new StringBuilder();

        int n=a.length();
        int i=0;

        while(i<n)
        {
            char c=a.charAt(i);

            if(c=='i' || c=='I')
            {
                if(ans.length()>0 && ans.charAt(ans.length()-1)!=' '){
                    ans.deleteCharAt(ans.length()-1);
                }
                i++;

                if(i<n && a.charAt(i)!=' ') i++;
            }
            else {
                ans.append(c);
                i++;
            }
        }
        System.out.println(ans.toString().stripLeading());


    }

    public static String Function(String a)
    {
        StringBuilder ans=new StringBuilder();

        int i=0;
        int n=a.length();

        while(i<n)
        {
            char x=a.charAt(i);

            if(x=='i' || x=='I')
            {
                if(ans.length()>0 && ans.charAt(ans.length()-1)!=' '){
                    ans.deleteCharAt(ans.length()-1);
                }
                i++;
                if(i<n && a.charAt(i)!=' '){
                    i++;
                }
            }else
            {
                ans.append(x);
                i++;
            }

        }

        return ans.toString().stripLeading();
        /*
        int start = 0;
while (start < ans.length() && ans.charAt(start) == ' ') {
    start++;
}
String finalAns = "";
for (int j = start; j < ans.length(); j++) {
    finalAns += ans.charAt(j);
}

         */
    }

}
