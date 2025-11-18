package folders.set.set4;
public class ConcatenateStrings {
    public static void main(String[] args) {
        char[] str1 = {'c','a','t'};
        char[] str2 = {'t','r','e','e'};

        // calculate length of final array
        int len1 = str1.length;
        int len2 = str2.length;

        boolean skipFirst = false;
        if (str1[len1 - 1] == str2[0]) {
            skipFirst = true;
        }

        int finalLen = len1 + (skipFirst ? len2 - 1 : len2);
        char[] result = new char[finalLen];

        // copy first string
        for (int i = 0; i < len1; i++) {
            result[i] = str1[i];
        }

        // copy second string
        for (int i = 0; i < len2; i++) {
            if (i == 0 && skipFirst) continue;
            result[len1++] = str2[i];
        }

        // print result
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        System.out.println();
    }
}

