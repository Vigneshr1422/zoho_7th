package Zoho.Experience.Zoho_Images.ImageSet1;

public class honoiTower {
    public static void main(String[] args) {
        int n=4;

        solve(n,'A','B','C');
    }

    public static void solve(int n,char a, char b, char c)
    {
        if(n==0) return;

        solve(n-1, a, c, b);
        System.out.println("Tower is "+n+" start "+a+" to "+ c);
        solve(n-1,b,a,c);
    }
}
