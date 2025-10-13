package GitHub_pradeep;
/*
"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\lib\idea_rt.jar=53167:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\bin" -Dfile.encoding=UTF-8 -classpath "D:\Zoho-7th Attempt\out\production\Zoho-7th Attempt" Patterns.pascal
     1
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1

 */
public class No_83_pascal {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
            // space
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            int val=1;
            for (int j=0;j<=i;j++) {
                System.out.print(val+" ");
                val = val *(i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
