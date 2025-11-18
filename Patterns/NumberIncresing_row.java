package Patterns;
/*
"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\lib\idea_rt.jar=57460:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\bin" -Dfile.encoding=UTF-8 -classpath "D:\Zoho-7th Attempt\out\production\Zoho-7th Attempt" Patterns.NumberIncresing_row
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15

Process
 */
public class NumberIncresing_row {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {        // row
            int num = i;
            for (int j = 1; j <= i; j++) {    // column in row
                System.out.print(num + " ");
                num += n - j;                  // jump to next diagonal number
            }
            System.out.println();
        }
    }
}
