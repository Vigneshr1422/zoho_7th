package Patterns;
public class a4_a1_hallowSquare {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1||j==n-1){
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static class pascal {
        public static void main(String[] args) {
            int n=5;

            for(int i=0;i<n;i++){
                for(int s=0;s<n-i;s++){
                    System.out.print(" ");
                }

                int val=1;
                for(int j=0;j<=i;j++){
                    System.out.print(val+" ");
                    val=val * (i-j) /(j+1);
                }
                System.out.println();
            }
        }
    }
}
