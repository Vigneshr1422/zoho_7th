package Patterns;
/*
"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\lib\idea_rt.jar=55778:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\bin" -Dfile.encoding=UTF-8 -classpath "D:\Zoho-7th Attempt\out\production\Zoho-7th Attempt" Patterns.pyramid_increse_reverse_increse
        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5

 */
public class Pramid_patter {
    public static void main(String[] args) {
        int n=3;

        for(int i=1;i<=n;i++)
        {
            for(int s=i;s<n;s++){
                System.out.print("-");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }   // reverse

         for(int i=n-1;i>=1;i--)
        {
            for(int s=i;s<n;s++){
                System.out.print("-");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
