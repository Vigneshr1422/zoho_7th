package Zoho.Others;

public class substring_no_buildIn {
    public static void main(String[] args) {
//        String a="Saripotha Sanivaram";
//        String b="Sani";
        String a="abc";
        String b="c";
        System.out.println("answer "+substring(a,b));
    }
    public static int substring(String a,String b)
    {
        int x=a.length();
        int y=b.length();
        if(y>x)
        {
            return -1;
        }
        for(int i=0;i<=x-y;i++)
        {
            int j=0;
            while(j<y && a.charAt(i+j)==b.charAt(j))
            {
                j++;
            }
            if(j==y)
            {
                return i;
            }
        }
        return -1;
    }
}
/*


public class Main {
    public static void main(String[] args) {
        String a = "one two three";
        System.out.println(reverseWords(a));
    }

    public static String reverseWords(String str) {
        str = str.trim();
        if (!containsSpace(str)) {
            return str;
        }

        int spaceIndex = indexOfSpace(str); // manually get space position
        String first = manualSubstring(str, 0, spaceIndex); // first word
        String rest = manualSubstring(str, spaceIndex + 1, str.length()); // rest of the string

        return reverseWords(rest) + " " + first;
    }

    // Function to manually find index of first space
    public static int indexOfSpace(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                return i;
            }
        }
        return -1; // if no space found
    }

    // Function to manually check for any space
    public static boolean containsSpace(String str) {
        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                return true;
            }
        }
        return false;
    }

    // Manual substring function: similar to str.substring(start, end)
    public static String manualSubstring(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}

 */