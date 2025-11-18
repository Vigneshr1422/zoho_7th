package Zoho.Others;

public class num_to_word {
   static String []one={
            "","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen",
            "fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"
    };

    static String []ten={
            "","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety","hundred"
    };

    static String []tho={
            "","thousand","Million ","Billoion"
    };

    public static void main(String[] args) {
      int n= 885;
        System.out.println(funtion(n));
    }
    public static String funtion(int n) {
        if(n==0){
            return "Zero";
        }
        int i=0;
        String word="";

        while(n!=0){
            if(n%1000!=0){
                word=help(n%1000)+ tho[i]+word;
            }
            i++;
            n/=1000;
        }
        return  word;
    }

    public static String help(int n){
        if(n==0){
            return  "";
        }
        else if(n<20){
            return  one[n];
        }else if(n<100){
            return ten[n/ 10]+" "+help(n%10);
        }else
        {
            return  one[n/100]+" Hundred"+help(n%100);
        }
    }
}
