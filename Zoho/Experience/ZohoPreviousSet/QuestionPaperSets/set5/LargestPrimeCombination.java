package set5;

import java.util.Arrays;

public class LargestPrimeCombination {
    public static void main(String[] args) {
        String s="4691";
        char[]arr=s.toCharArray();

        Arrays.sort(arr);
        reverse(arr);

         if(!possiblePrime(arr)) {
            System.out.println("No prime possible");
            return;
        }
      

        boolean []check=new boolean[arr.length];
        StringBuilder ans=new StringBuilder();

        if(!findprime(arr,check,ans)){
            System.out.println("No prime da thambi");
        }
        

    }

    public static boolean possiblePrime(char[] digits) {
        int sum = 0;
        boolean hasOdd = false;
        boolean hasNon5 = false;

        for(char d : digits) {
            int val = d - '0';
            sum += val;
            if(val % 2 != 0) hasOdd = true;    // check for odd digits
            if(val != 5) hasNon5 = true;       // check for digits other than 5
        }

        // Rule 1: sum divisible by 3 → any permutation divisible by 3 → not prime
        if(sum % 3 == 0) return false;

        // Rule 2: all digits even → all numbers even → not prime
        if(!hasOdd) return false;

        // Rule 3: all digits 0 or 5 → numbers divisible by 5 → not prime
        if(!hasNon5) return false;

        return true;
    }

    public static boolean findprime(char []arr, boolean [] check, StringBuilder ans)
    {

        if(ans.length()==arr.length){
            int num=Integer.parseInt(ans.toString());
            if(isPrime(num)){
            System.out.println(num);
            return true;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(!check[i]){
                check[i]=true;
                ans.append(arr[i]);
                if(findprime(arr, check, ans)) return true;

                ans.deleteCharAt(ans.length()-1);
                check[i]=false;
            }
        }
        return false;
    }

    public static boolean isPrime(int n){
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0) return false;

        for(int i=3;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }

    public static void reverse(char []arr){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            char t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }
    }
    
}
