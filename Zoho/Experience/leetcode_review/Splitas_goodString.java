package leetcode_review;

public class Splitas_goodString {
 public static void main(String[] args) {
    String str="aacaba";

    int left[]=new int[26];
    int right[]=new int[26];
    int leftsum=0;
    int rightsum=0;

    for(char s:str.toCharArray()){
        if(right[s-'a']==0){
            rightsum++;
        }
        right[s-'a']++;
    }
    int ans=0;
    int n=str.length();
    for(int i=0;i<n-1;i++){
        char c=str.charAt(i);

        if(left[c-'a']==0){
            leftsum++;
        }
        left[c-'a']++;

        right[c-'a']--;

        if(right[c-'a']==0){
            rightsum--;
        }

        if(rightsum==leftsum){
            ans++;
        }

    }

    System.out.println(ans);
 }   
}
