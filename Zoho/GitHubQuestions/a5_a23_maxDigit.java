package GitHubQuestions;

public class a5_a23_maxDigit {
    public static void main(String[] args) {
        int n=33;
        int ans=0;
        while(n!=0)
        {
            int r=n%10;
            if(r>ans) ans=r;
            n/=10;
        }
        System.out.println(ans);
    }
}
