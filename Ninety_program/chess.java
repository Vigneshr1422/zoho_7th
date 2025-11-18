package Ninety_program;

public class chess {
    public static void main(String[] args) {
        int n=3;

        int formula=(n*(n+1)/2) * (n*(n+1)/2);
        System.out.println("No of rectangle formula "+formula);

        int form=(n*(n+1)*(2*n+1)/6);
        System.out.println("No of square formula "+form);
    }
}
