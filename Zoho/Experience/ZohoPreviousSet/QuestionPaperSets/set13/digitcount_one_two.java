package set13;

public class digitcount_one_two {
    public static void main(String[] args) {
        int n=15;

        int c=0;
        int d=1;
        int s=1;

        while(s*10<=n)
        {
            int e=s*10-1;
            c=c+(e-s+1)*d;
            d++;
            s=s*10;
        }
        c=c+(n-s+1)*d;
        System.out.println(c);
    }
}
