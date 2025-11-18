package Patters;

public class rotate_number {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int d=i;
            for(int j=1;j<=n;j++){
                System.out.print(d+" ");
                d++;
                if(d>n){
                    d=1;
                }
            }
            System.out.println();
        }
    }
}
