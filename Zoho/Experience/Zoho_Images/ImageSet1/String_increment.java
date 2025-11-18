package Zoho.Experience.Zoho_Images.ImageSet1;

public class String_increment {
    public static void main(String[] args) {
        String a = "zoho";
        String b = " Wake me early at 5.a.m";
        int m = 3;
        int n = 4;
        function(a, n);
        System.out.println();
        function(b, m);
    }

    public static void function(String a, int n) {
        for (char x : a.toCharArray()) {
            if (x >= 'a' && x <= 'z') {
                char y = (char) ('a' + (x - 'a' + n) % 26);
                System.out.print(y);
            } else if (x >= 'A' && x <= 'Z') {
                char y = (char) ('A' + (x - 'A' + n) % 26);
                System.out.print(y);
            } else if (x >= '0' && x <= '9') {
                char y = (char) ('0' + (x - '0' + n) % 10);
                System.out.print(y);
            } else {
                System.out.print(x);
            }
        }
    }
}
