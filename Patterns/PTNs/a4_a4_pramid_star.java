package Patters;

public class a4_a4_pramid_star {
    public static void main(String[] args) {
        int n=5;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){

                System.out.print(" ");
            }
            for(int j=0;j<(2*i-1);j++){         
                       System.out.print("*");   
            }
            System.out.println();
        }

         for(int i=n-1;i>=0;i--){
            for(int j=i;j<n;j++){

                System.out.print(" ");
            }
            for(int j=0;j<(2*i-1);j++){         
                       System.out.print("*");   
            }
            System.out.println();
        }
    }
}
