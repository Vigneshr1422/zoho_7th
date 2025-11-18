package GitHubQuestions;
/*
 * 90. Given a string, reverse only vowels in it; leaving rest of the string as it is.
Input : abcdef
Output : ebcdaf
 */
public class vowelReverse {
    public static void main(String[] args) {
        String str="abcdef";
        System.out.println(reverseVowel(str));
    }

    public static boolean isVowel(char y){
        char x=Character.toLowerCase(y);
        if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u')
        {
            return true;
        }
        return false;
    }

    public static String reverseVowel(String str){
        char []arr=str.toCharArray();

        int i=0;
        int j=arr.length-1;

        while(i<j){
            while(i<j && !isVowel(arr[i]))
            i++;
            while(i<j && !isVowel(arr[j]))
            j--;

            if(i<j){
                char t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                i++;
                j--;
            }

        }

        return new String(arr);
    }
    
}
