package GitHubQuestions;

public class a5_a_PasswordStrength {
    public static String checkStrength(String password) {
        boolean hasLower = false, hasUpper = false, hasDigit = false, hasSpecial = false;
        String specialChars = "!@#$%^&*()-_+=<>?/.,";
        
        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) hasLower = true;
            if (Character.isUpperCase(ch)) hasUpper = true;
            if (Character.isDigit(ch)) hasDigit = true;
            if (specialChars.indexOf(ch) >= 0) hasSpecial = true;
        }

        int rulesSatisfied = 0;
        if (hasLower) rulesSatisfied++;
        if (hasUpper) rulesSatisfied++;
        if (hasDigit) rulesSatisfied++;
        if (hasSpecial) rulesSatisfied++;

        switch (rulesSatisfied) {
            case 4: return "Strong";
            case 3: return "Good";
            case 2: return "Medium";
            default: return "Weak";
        }
    }

    public static void main(String[] args) {
        System.out.println(checkStrength("Qw!1"));        // Output: Weak
        System.out.println(checkStrength("Qwertyuiop")); // Output: Medium
        System.out.println(checkStrength("QwertY123"));  // Output: Good
        System.out.println(checkStrength("Qwerty@123")); // Output: Strong
    }
}
