package Patters;

public class p2 {
    public static void main(String[] args) {
        int n=5;
        int y=1;
        for(int i=1;i<=5;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print("-");
            }
            for(int j=1;j<=i;j++){
                System.out.print((y++)+ " ");
            }
            System.out.println();
        }
    }
}
