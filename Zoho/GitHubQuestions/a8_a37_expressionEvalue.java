package GitHubQuestions;
import java.util.*;
public class a8_a37_expressionEvalue {
    
    static class Expression{
        String s;
        int val;

        Expression(String s)
        {
            this.s=s;
            this.val=powerfunction(s);
        }
    }

    public static int powerfunction(String str)
    {
        if(str.contains("^"))
        {
            String parts[]=str.split("\\^");
            int pow=Integer.parseInt(parts[parts.length-1]);
            for(int i=parts.length-2;i>=0;i--){
                pow=(int )Math.pow(Integer.parseInt(parts[i]),pow);

            }
            return pow;

        }else if(str.contains("*"))
        {
            String []part=str.split("\\*");
            return Integer.parseInt(part[0])* Integer.parseInt(part[1]);
        }
        else {
            return Integer.parseInt(str);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no of expression");
        int n=in.nextInt();

        in.nextLine();

        Expression[] arr=new Expression[n];

        for(int i=0;i<n;i++){
            String expr=in.nextLine();
            arr[i]=new Expression(expr);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j].val > arr[j + 1].val) {
                    Expression temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].s);
        }

        

    }
}
