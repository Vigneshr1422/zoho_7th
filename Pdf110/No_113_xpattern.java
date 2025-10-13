package Pdf110;

public class No_113_xpattern {
    public static void main(String[] args) {
        String a="GeeksforGeeks";

        for(int i=0;i<a.length();i++)
        {
            for(int j=0;j<a.length();j++)
            {
                if( i+j==a.length()-1 || i==j)
                {
                    System.out.print(a.charAt(i));
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
