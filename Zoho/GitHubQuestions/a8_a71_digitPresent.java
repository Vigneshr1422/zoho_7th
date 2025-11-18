package GitHubQuestions;

public class a8_a71_digitPresent {
    public static void main(String[] args) {
        int a=23;
        int b=174526323;
        // if(isPresent(a,b)){
        //     System.out.println("Present ");
        // }else
        // {
        //     System.out.println("Noyt bro ");
        // }

        bruteForce(a,b);
    }
    public static void bruteForce(int a , int b)
    {
        String n1=""+a;
        String n2=""+b;
        int n=0;
        for(int i=0;i<n2.length();i++){
            char x=n2.charAt(i);
            for(int j=0;j<n1.length();j++)
            {
                if(x==n1.charAt(j)){
                    n++;
                }
            }
        }

        if(n==n2.length()){
            System.out.println("Present");
        }
        else{
            System.out.println("Not bro");
        }
    }

    public class DigitPresent {
    public static void main(String[] args) {
        int a = 23;
        int b = 174526323;

        checkDigits(a,b);
    }

    public static void checkDigits(int a, int b){
        boolean[] present = new boolean[10];

        // mark digits in a
        while(a > 0){
            int d = a % 10;
            present[d] = true;
            a /= 10;
        }

        // check digits in b
        int temp = b;
        while(temp > 0){
            int d = temp % 10;
            if(!present[d]){
                System.out.println("Not bro");
                return;
            }
            temp /= 10;
        }

        System.out.println("Present");
    }
}


    public static boolean isPresent(int a,int b)
    {
        int len=countDigit(a);
        int div=(int)Math.pow(10, len);
        while(b!=0)
        {
            int rem=b%div;
            if(rem==a) return true;
            b/=10;
        }

        return false;

    }

    public static int countDigit(int n)
    {
        int c=0;
        while( n!=0){
            c++;
            n/=10;
        }
        return c;
    }
    
}
