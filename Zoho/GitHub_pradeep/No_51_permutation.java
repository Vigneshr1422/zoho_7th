package Zoho.GitHub_pradeep;

import java.util.ArrayList;
import java.util.List;

public class No_51_permutation {
    public static void main(String[] args) {
        String s = "ABC";
        int n = s.length();

        for(int len = 1; len <= n; len++){
            List<String> combinations = new ArrayList<>();
            combine(s, "", 0, len, combinations);

            // For each combination, print all permutations
            for(String comb : combinations){
                List<String> perms = new ArrayList<>();
                permute(comb.toCharArray(), 0, perms);
                for(String p : perms){
                    System.out.print(p + " ");
                }
            }
        }
    }

    // Generate combinations of given length
    static void combine(String s, String current, int index, int len, List<String> res){
        if(current.length() == len){
            res.add(current);
            return;
        }
        for(int i = index; i < s.length(); i++){
            combine(s, current + s.charAt(i), i + 1, len, res);
        }
    }

    // Generate permutations of char array
    static void permute(char[] arr, int l, List<String> res){
        if(l == arr.length){
            res.add(new String(arr));
            return;
        }
        for(int i = l; i < arr.length; i++){
            swap(arr, l, i);
            permute(arr, l+1, res);
            swap(arr, l, i); // backtrack
        }
    }

    static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
