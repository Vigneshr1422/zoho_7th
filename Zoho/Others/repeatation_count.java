package Zoho.Others;
//day 2
// abcac
public class repeatation_count {
    public static void main(String[] args) {
        String a="abc";
        int n=10;

        // per word count
        int count=0;
        for(char x:a.toCharArray()) {
            if(x=='a') {
                count++;
            }
        }
        // total repetition count

        int wordcount=n/a.length();

        // count for word
        count*=wordcount;

        // remaining word

        int remaining = n%a.length();

        for(int i=0;i<remaining;i++)
        {
            if(a.charAt(i)=='a')
            {
                count++;
            }
        }
        System.out.println(count);



    }
}
