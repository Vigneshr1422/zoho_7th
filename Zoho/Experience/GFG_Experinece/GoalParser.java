package Zoho.Experience.GFG_Experinece;

public class GoalParser {
      public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));         // Goal
        System.out.println(interpret("G()()()()(al)"));   // Gooooal
        System.out.println(interpret("G()()"));           // Goo
    }

    public static String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < command.length()) {
            char c = command.charAt(i);
            if (c == 'G') {
                sb.append('G');
                i++;
            } else if (c == '(') {
                if (i + 1 < command.length() && command.charAt(i + 1) == ')') {
                    sb.append('o');
                    i += 2;
                } else {
                    sb.append("al");
                    i += 4; // skip "(al)"
                }
            }
        }
        return sb.toString();
    }

  
}

