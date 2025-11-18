package Patterns;
/*
"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\lib\idea_rt.jar=57408:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\bin" -Dfile.encoding=UTF-8 -classpath "D:\Zoho-7th Attempt\out\production\Zoho-7th Attempt" Patterns.pyramid_increse_reverse_increse
        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5

 */
public class pyramid_increse_reverse_increse {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            int num=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }

            num-=2;
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(num+" ");
                num--;
            }
            System.out.println();
        }
    }
}
