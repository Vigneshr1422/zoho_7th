package Pdf110;

public class No_32_numberPresent {
    public static void main(String[] args) {
        int a = 11598452;
        int b = 48;

        int lenB = (int)(Math.log10(b)) + 1;  // use log10
        int pow10 = (int) Math.pow(10, lenB);

        boolean found = false;
        while (true) {
            if (a % pow10 == b) {
                found = true;
                break;
            }
            a /= 10;
        }

        System.out.println(found ? b + " is present in " + a : b + " is NOT present in " + a);
    }
}
