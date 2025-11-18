package ZZ_Ninja360;

public class StringContains {
    public static void main(String[] args) {
        String a = "abc";
        String b = "def";
        String c = "adbcf";

        int[] arr = new int[26];
        int[] arr2 = new int[26];
        String d = a + b;
        for (char x : d.toCharArray()) {
            arr[x-'a']++;
        }
        for (char i : c.toCharArray()) {
            arr2[i-'a']++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("Yes");
    }
}
