package GitHubQuestions;

public class a5_a22_StringPattern_ {
    public static void main(String[] args) {
        int n=5;

        int ans=65;
 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
            {
                int x=ans+((i+j-2)%n);
                System.out.print((char)(x)+" ");
            }
            System.out.println();
        }
    }
}
