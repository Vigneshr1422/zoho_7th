package Zoho.GitHub_pradeep;

import java.util.Scanner;

public class No_90_ReverseVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println("Output: " + reverseVowels(s));
    }

    static String reverseVowels(String s){
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while(i < j){
            if(!isVowel(arr[i])) i++;
            else if(!isVowel(arr[j])) j--;
            else{
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; j--;
            }
        }
        return new String(arr);
    }

    static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
