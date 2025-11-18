package set6;

public class mathemetical_opertion {
    public static void main(String[] args) {
        String a="1*2+3-4/5";
        int res=a.charAt(0)-'0';


        int i=1;
        while(i<a.length())
        {
            char c=a.charAt(i++);
            int n=a.charAt(i++)-'0';

            switch (c) {
                case '*':
                    res=res*n;
                    break;
                
                    case '/' :
                    res/=n;
                    break;

                    case '+':
                    res+=n;
                    break;

                    case '-':
                    res-=n;

                    break;
        
            }

        }

        System.out.println(res);
    }
}
