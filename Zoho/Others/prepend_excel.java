package Zoho.Others;

public class prepend_excel {
    public static void main(String[] args) {
        int num=77;
        System.out.println("Answer "+excelfun(num));
    }
    static String excelfun(int n) {
     StringBuilder ans=new StringBuilder();
        while (n > 0) {
            n--;
            int rem = n % 26;
            char x=(char) (rem+'A');
            ans.append(x);
            n /= 26;
        }
        return ans.reverse().toString();
    }
}
