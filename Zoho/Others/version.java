
package Zoho.Others;
//28
public class version {
    public static void main(String[] args) {
        String version1 = "2.4.6.0";
        String version2 = "2.5.9";

        String[] arr = version1.split("\\.");
        String[] arr2 = version2.split("\\.");

        int n = Math.max(arr.length, arr2.length);

        for (int i = 0; i < n; i++) {
            int f = i < arr.length ? Integer.parseInt(arr[i]) : 0;
            int s = i < arr2.length ? Integer.parseInt(arr2[i]) : 0;

            if (f < s) {
                System.out.println("Upgraded");
                return;
            } else if (f > s) {
                System.out.println("Downgraded");
                return;
            }
        }

        // If all parts equal
        System.out.println("Not changed");
    }
}
