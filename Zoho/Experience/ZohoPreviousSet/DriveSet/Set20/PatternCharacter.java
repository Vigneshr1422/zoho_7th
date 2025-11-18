package Zoho.Experience.ZohoPreviousSet.DriveSet.Set20;

public class PatternCharacter {
    public static void main(String[] args) {
        int n = 5;
//        PatternFunction(n);
        PatternFunctionPyramidLike(n);
    }

    public static void PatternFunction(int n) {
        int totalRow = 2*n - 1;

        for (int i = 0; i < totalRow; i++) {
            int row = i < n ? i : totalRow - 1 - i;

            // leading spaces
            for (int s = 0; s < n - 1 - row; s++)
                System.out.print("--");

            // descending letters
            for (int j = 0; j <= row; j++) {
                char ch = (char)('a' + n - 1 - j); // top letter = 'a'+n-1
                System.out.print(ch + " ");
            }

            // ascending letters
            for (int j = row - 1; j >= 0; j--) {
                char ch = (char)('a' + n - 1 - j);
                System.out.print(ch + " ");
            }
            for (int s = 0; s < n - 1 - row; s++)
                System.out.print("--");

            System.out.println();
        }
    }

    public static void PatternFunctionPyramidLike(int n)
    {
        int size=2*n-1;

        for(int i=0;i<size;i++)
        {
            int row=i<n?i:size-1-i;

            for(int s=0;s<n-1-row;s++){
                System.out.print("--");
            }

            for(int j=0;j<=row;j++)
            {
                char x=(char) ('a' +n-1-j);
                System.out.print(x+" ");
            }

            for(int j=row-1;j>=0;j--){
                char x=(char) ('a' +n-1-j);
                System.out.print(x+" ");

            }

            for(int s=0;s<n-1-row;s++){
                System.out.print("--");
            }
            System.out.println();
        }
    }
}
