package GitHub_pradeep;

public class No_59_PhoneDigitsToWords {
        // Mapping for digits 0–9
        static String[] keypad = {
                "", "", "ABC", "DEF", "GHI",
                "JKL", "MNO", "PQRS", "TUV", "WXYZ"
        };

        public static void main(String[] args) {
            int[] digits = {2, 3, 4};  // Example input
            printCombinations(digits, 0, "", digits.length);
        }

        // Recursive function to generate all possible combinations
        static void printCombinations(int[] digits, int index, String current, int n) {
            if (index == n) {
                System.out.print(current + " ");
                return;
            }

            String letters = keypad[digits[index]];
            for (int i = 0; i < letters.length(); i++) {
                printCombinations(digits, index + 1, current + letters.charAt(i), n);
            }
        }
    }

