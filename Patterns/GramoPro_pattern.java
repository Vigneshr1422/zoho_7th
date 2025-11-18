
package Patterns;
public class GramoPro_pattern {
    public static void main(String[] args) {
        String s = "PROGRAM";
        int k = 3; // rotate left by 2

        // substring split
        String str = s.substring(k) + s.substring(0, k);
        System.out.println(str);
        int n = str.length();

        for (int i = 1; i <= n; i++) {
            // Left stars
            for (int j = 0; j < (n - i) * 3; j++) {
                System.out.print("-");
            }

            // Print substring of string (first i chars)
            System.out.print(str.substring(0, i));

            // Right stars
            for (int j = 0; j < (i - 1); j++) {
                System.out.print("-");
            }

            System.out.println();
        }
    }
    public static String rev(String s){
        char []arr=s.toCharArray();
        int st=0;
        int e=s.length()-1;

        while(st<e){
            char t= arr[st];
            arr[st]=arr[e];
            arr[e]=t;
            st++;
            e--;
        }
        return  new String(arr);
    }
}
