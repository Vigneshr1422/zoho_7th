package GFG_Experinece;

public class a4_2_josepu_problem {
 public static void main(String[] args) {
    int n=5;
    int s=3;

    int k=2;
    function(n,s,k);
 }   

 public static void function(int n,int s,int k)
 {
    int ans=0;

    for(int i=2;i<=n;i++){
        ans=(ans+k)%i;
    }
    System.out.println((ans+s-1)%n+1);
 }
}
