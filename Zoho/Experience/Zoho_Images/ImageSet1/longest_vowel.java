package Zoho.Experience.Zoho_Images.ImageSet1;

public class longest_vowel {
    public static void main(String[] args) {
        String a="aioeoeju";
        function(a);
    }
    public static void function(String str)
    {
        String vowel="aeiou";
        str=str.toLowerCase();
        int len=0;
        String ans="";
        for(int i=0;i<str.length();i++)
        {
            if(vowel.indexOf(str.charAt(i))!=-1){

                for(int j=i;j<str.length();j++)
                {
                    if(vowel.indexOf(str.charAt(j))!=-1){

                        String store=str.substring(i, j+1);
                        if(store.length()>len){
                            len=store.length();
                            ans=store;

                        }
                    }
                }
            }
        }
        if(len>0){
            System.out.println("word "+ans+" count "+len);
        }
    }
}
