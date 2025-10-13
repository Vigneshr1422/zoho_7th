package Pdf110;

public class No_44_PasswordStrength {
    public static void main(String[] args) {
        String password = "Abc@1234";
        System.out.println("Password Strength: " + strength(password));
    }

    public static int strength(String s) {
        int score = 0;
        boolean upper = false, lower = false, digit = false, special = false, space = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') upper = true;
            else if (ch >= 'a' && ch <= 'z') lower = true;
            else if (ch >= '0' && ch <= '9') digit = true;
            else if (ch == ' ') space = true;
            else special = true;
        }

        if (s.length() >= 8) score += 2;
        if (upper) score += 2;
        if (lower) score += 2;
        if (digit) score += 2;
        if (special) score += 2;
        if (!space) score += 1;

        return score;
    }
}
