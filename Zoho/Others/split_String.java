package Zoho.Others;
//28
public class split_String {
    public static void main(String[] args) {
        String a="Hacker";
        String b="Rak";

        String adds1="";
        String evens1="";
        String adds2="";
        String evens2="";

        for(int  i=0;i<a.length();i++)
        {
            if(i%2==0)
            {
                adds1+=a.charAt(i);
            }
            else
            {
                evens1+=a.charAt(i);
            }
        }


        for(int  i=0;i<b.length();i++)
        {
            if(i%2==0)
            {
                adds2+=b.charAt(i);
            }
            else
            {
                evens2+=b.charAt(i);
            }
        }


        System.out.println(a+" answer is "+adds1+" "+evens1);
        System.out.println(b+" answer is "+adds2+" "+evens2);


    }
}
