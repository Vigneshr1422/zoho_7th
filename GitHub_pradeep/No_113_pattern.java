package GitHub_pradeep;

public class No_113_pattern {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++)
        {
            int x=i;
            for(int j=1;j<=n;j++)
            {
                System.out.print(x+" ");
                x++;
                if(x>n)
                {
                    x=1;
                }
            }
            System.out.println();
        }
    }
}
