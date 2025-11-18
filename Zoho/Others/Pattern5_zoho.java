package Zoho.Others;

public class Pattern5_zoho {
    public static void main(String[] args) {
        String input="WELCOMETOZOOCORPORATION";
        char [][]arr=new char[5][5];
        int index=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if (index < input.length()) {
                    arr[i][j] = input.charAt(index++);
                } else {
                    arr[i][j] = ' '; // Fill with space or any default char
                }

            }
        }

        System.out.println("Input \n");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        String word="TOO";
        System.out.println("Target is "+word);
        boolean cheak=false;

        for (int i = 0; i < 5 && !cheak; i++) {
            for (int j = 0; j <= 5 - word.length(); j++) {
                boolean match = true;
                for (int k = 0; k < word.length(); k++) {
                    if (arr[i][j + k] != word.charAt(k)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    System.out.println("Start index  : <" + i + "," + j + ">");
                    System.out.println("End index  : <" + i + "," + (j + word.length() - 1) + ">");
                    cheak = true;
                    break;
                }
            }
        }


        for (int i = 0; i <= 5 - word.length() && !cheak; i++) {
            for (int j = 0; j < 5; j++) {
                boolean match = true;
                for (int k = 0; k < word.length(); k++) {
                    if (arr[i + k][j] != word.charAt(k)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    System.out.println("Start index  : <" + i + "," + j + ">");
                    System.out.println("End index  : <" + (i + word.length() - 1) + "," + j + ">");
                    cheak = true;
                    break;
                }
            }
        }

        if(!cheak)
        {
            System.out.println("Not found");
        }
    }
}
