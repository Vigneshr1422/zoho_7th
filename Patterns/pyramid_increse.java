package Patterns;
/*
"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\lib\idea_rt.jar=57443:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\bin" -Dfile.encoding=UTF-8 -classpath "D:\Zoho-7th Attempt\out\production\Zoho-7th Attempt" Patterns.pyramid_increse
----1
---2 3
--4 5 6
-7 8 9 10
11 12 13 14 15
 */
public class pyramid_increse {
    public static void main(String[] args) {
        int n=5;
        int y=1;
        for(int i=1;i<=5;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print("-");
            }
            for(int j=1;j<=i;j++){
                System.out.print((y++)+ " ");
            }
            System.out.println();
        }
    }
}
