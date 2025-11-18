package Patterns;

public class pyramid_increse_plus2 {
    public static void main(String[] args) {
        int n=5;
        int  t=1;
        for(int i=1;i<=n;i++){
            // spaces 
            for(int s=1;s<=(n-i);s++){
                System.out.print("  ");
            }
            
            for(int j=1;j<=i;j++){
                System.out.print(t+" ");
                t+=2;
            }
            System.out.println();
        }
    }
}
