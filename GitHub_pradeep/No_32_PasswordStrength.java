package GitHub_pradeep;
import java.util.Scanner;

public record No_32_PasswordStrength() {

    public class PasswordStrength {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String pwd = sc.nextLine();
            int rules = 0;

            boolean hasLower = false, hasUpper = false, hasDigit = false, hasSpecial = false;

            for (int i = 0; i < pwd.length(); i++) {
                char c = pwd.charAt(i);
                if (!hasLower && c >= 'a' && c <= 'z') hasLower = true;
                else if (!hasUpper && c >= 'A' && c <= 'Z') hasUpper = true;
                else if (!hasDigit && c >= '0' && c <= '9') hasDigit = true;
                else if (!hasSpecial && "!@#$%^&*()-_+=<>?/.,;:".indexOf(c) >= 0) hasSpecial = true;
            }

            if (hasLower) rules++;
            if (hasUpper) rules++;
            if (hasDigit) rules++;
            if (hasSpecial) rules++;

            switch (rules) {
                case 4:
                    System.out.println("Strong");
                    break;
                case 3:
                    System.out.println("Good");
                    break;
                case 2:
                    System.out.println("Medium");
                    break;
                default:
                    System.out.println("Weak");
            }
        }
    }
}
