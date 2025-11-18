package Zoho.Others;

import java.util.Stack;

public class ExpandExamples {
    public static void main(String[] args) {

        // 1️⃣ Case 1 — Simple letter + count
        String input1 = "a3b2c1";
        System.out.println("Expand Each Letter : " + expandLetters(input1)); // aaabbc
        System.out.println("Expand Each 2nd  Letter : " + decodeBrackets(input1)); // aaabbc


        // 2️⃣ Case 2 — Bracket encoding
        System.out.println("Decode [ ] Form    : " + decodeBrackets("3[a]2[bc]"));     // aaabcbc
        System.out.println("Decode [ ] Form    : " + decodeBrackets("3[NumberDecendingTriangle[c]]"));      // accaccacc
        System.out.println("Decode [ ] Form    : " + decodeBrackets("2[abc]3[cd]ef")); // abcabccdcdcdef
    }

    // ---------- TYPE 1 : a3b2c1 ----------
    public static String expandLetters(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                int j = i + 1;
                StringBuilder num = new StringBuilder();

                // collect the number after the letter
                while (j < str.length() && Character.isDigit(str.charAt(j))) {
                    num.append(str.charAt(j));
                    j++;
                }

                int count = !num.isEmpty() ? Integer.parseInt(num.toString()) : 1;

                // repeat the character 'count' times
                result.append(String.valueOf(ch).repeat(count));

                i = j - 1; // move i to end of number
            }
        }
        return result.toString();
    }

    public static String decodeBrackets1(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        int num = 0;
        String current = "";

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(num);
                stringStack.push(current);
                num = 0;
                current = "";
            } else if (ch == ']') {
                int repeat = countStack.pop();
                String prev = stringStack.pop();
                current = prev + current.repeat(repeat);
            } else {
                current += ch;
            }
        }
        return current;
    }


    // ---------- TYPE 2 : 3[NumberDecendingTriangle[c]] ----------
    public static String decodeBrackets(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int num = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(num);
                stringStack.push(current);
                num = 0;
                current = new StringBuilder();
            } else if (ch == ']') {
                int repeat = countStack.pop();
                StringBuilder temp = stringStack.pop();
                for (int i = 0; i < repeat; i++) {
                    temp.append(current);
                }
                current = temp;
            } else {
                current.append(ch);
            }
        }
        return current.toString();
    }


}
