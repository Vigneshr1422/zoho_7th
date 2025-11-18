package leetcode_review;

import java.util.Arrays;
import java.util.Stack;

public class secret_word {
    public static void main(String[] args) {
        String a="block";
        String b="clock";

        char res[]=new char[a.length()];
        int freq[]=new int[26];

        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(i)){
                res[i]='G';
            }else
            {
                res[i]='-';
                res[a.charAt(i)-'a']++;
            }
        }



        for(int i=0;i<a.length();i++)
        {
            if(res[i]=='-' && freq[a.charAt(i)-'a']>0){
                res[i]='Y';
            }

        }


        System.out.println(new String(res));

    }

    public static class temperartore {
        public static void main(String[] args) {
            int arr[]={73, 74, 75, 71, 69, 72, 76, 73};
            Stack<Integer> stack=new Stack<>();


            int ans[]=new int[arr.length];

            for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[i]>arr[stack.peek()])
            {
                int prev=stack.pop();
                ans[prev]=i-prev;
            }
            stack.add(i);

            }
            System.out.println(Arrays.toString(ans));

        }
    }
}
