package Patterns;

public class PatternCharacter {
    public static void main(String[] args) {
        int n = 5;
//        PatternFunction(n);
        PatternFunctionPyramidLike(n);
    }
/*
"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\lib\idea_rt.jar=53427:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\bin" -Dfile.encoding=UTF-8 -classpath "D:\Zoho-7th Attempt\out\production\Zoho-7th Attempt" Patterns.PatternCharacter
--------e --------
------e d e ------
----e d c d e ----
--e d c b c d e --
e d c b a b c d e
--e d c b c d e --
----e d c d e ----
------e d e ------
--------e --------

 */
    public static void PatternFunction(int n) {
        int totalRow = 2*n - 1;

        for (int i = 0; i < totalRow; i++) {
            int row = i < n ? i : totalRow - 1 - i;

            // leading spaces
            for (int s = 0; s < n - 1 - row; s++)
                System.out.print("--");

            // descending letters
            for (int j = 0; j <= row; j++) {
                char ch = (char)('a' + n - 1 - j); // top letter = 'a'+n-1
                System.out.print(ch + " ");
            }

            // ascending letters
            for (int j = row - 1; j >= 0; j--) {
                char ch = (char)('a' + n - 1 - j);
                System.out.print(ch + " ");
            }
            for (int s = 0; s < n - 1 - row; s++)
                System.out.print("--");

            System.out.println();
        }
    }

    public static void PatternFunctionPyramidLike(int n)
    {
        int size=2*n-1;

        for(int i=0;i<size;i++)
        {
            int row=i<n?i:size-1-i;

            for(int s=0;s<n-1-row;s++){
                System.out.print("--");
            }

            for(int j=0;j<=row;j++)
            {
                char x=(char) ('a' +n-1-j);
                System.out.print(x+" ");
            }

            for(int j=row-1;j>=0;j--){
                char x=(char) ('a' +n-1-j);
                System.out.print(x+" ");

            }

            for(int s=0;s<n-1-row;s++){
                System.out.print("--");
            }
            System.out.println();
        }
    }
}
