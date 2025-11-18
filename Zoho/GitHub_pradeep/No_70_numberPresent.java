package Zoho.GitHub_pradeep;

public class No_70_numberPresent {
    public static void main(String[] args) {
        int a = 11598452;
        int b = 45;

        int tempA = a;
        int lenB = (int)(Math.log10(b)) + 1;  // use log10
        int pow10 = (int) Math.pow(10, lenB);

        boolean found = false;
        while (tempA >= b) {
            if (tempA % pow10 == b) {
                found = true;
                break;
            }
            tempA /= 10;
        }

        System.out.println(found ? b + " is present in " + a : b + " is NOT present in " + a);
    }
}
