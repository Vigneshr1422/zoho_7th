package GitHub_pradeep;

public class No_7_Version {
    public static void main(String[] args) {
        String a="1.2.1";
        String b="1.2.0";

        verFunction(a,b);

    }
    public static void verFunction(String a,String b)
    {
        int n=a.length();
        int m=b.length();
        int i=0,j=0;
        while(i<n || j<m)
        {
            int n1=0;
            int n2=0;

            while(i<n && a.charAt(i)!='.'){
                n1=n1*10+(a.charAt(i)-'0');
                i++;
            }
            while(j<m && b.charAt(j)!='.'){
                n2=n2*10+(b.charAt(j)-'0');
                j++;
            }

            if(n1>n2){
                System.out.println("A is big");
                return;
            }else if(n1<n2)
            {
                System.out.println("B is big");
                return;
            }
            i++;
            j++;
        }

            System.out.println("Equal");

    }
}
