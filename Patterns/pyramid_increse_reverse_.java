package Patterns;
/*
"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\lib\idea_rt.jar=57440:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.4\bin" -Dfile.encoding=UTF-8 -classpath "D:\Zoho-7th Attempt\out\production\Zoho-7th Attempt" Patterns.pyramid_increse_reverse_
  1
 3 2
6 5 4
6 5 4
 3 2
  1
 */
public class pyramid_increse_reverse_ {
 public static void main(String[] args) {
    int n=3;

    for(int i=1;i<=n;i++){
        for(int s=i;s<n;s++){
            System.out.print(" ");
        }
        int num=(i*(i+1))/2;

        for(int j=0;j<i;j++){
            System.out.print(num--+" ");
    }
    System.out.println();
}

for(int i=n;i>=1;i--){
        for(int s=i;s<n;s++){
            System.out.print(" ");
        }
        int num=(i*(i+1))/2;

        for(int j=0;j<i;j++){
            System.out.print(num--+" ");
    }
    System.out.println();
}
 }   
}
