package Zoho.Experience.Zoho_Images.ImageSet1;

public class EasySplit {
    public static void main(String[] args) {
        StringSplitFunction();
       // StringSplitFunction();
    }
    public static void StringSplitFunction(){
        String s = " This is a // PowerShot. Total--755-runs$";
        String word = ""; // This

        for(char x:s.toCharArray()){
            if(x!=' '){
                word+=x;
            }else{
                if(word!=" "){
                    printWord(word);
                }
                word="";
            }
        }
        if(word!="") printWord(word);


//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c == ' ') { // space -> print collected word
//                if (word != "") printWord(word);
//                word = ""; //redo
//            } else word += c;
//        }
//        if (word != "") printWord(word);
    }
    static void printWord(String w) {
        String temp = "";
        for (int i = 0; i < w.length(); i++) {
            char c = w.charAt(i);
            char next = (i < w.length() - 1) ? w.charAt(i + 1) : ' ';
            temp += c;

            // lower→upper ||
            if ((c >= 'a' && c <= 'z' && next >= 'A' && next <= 'Z') ||  (c >= '0' && c <= '9' && !(next >= '0' && next <= '9')) || (!(isAlphaNum(c)) && isAlphaNum(next))
                    || (isAlphaNum(c) && !isAlphaNum(next)))
            { // <-- added this
                System.out.println(temp);
                temp = "";
            }
        }
        if (temp != "") System.out.println(temp);
    }

    static boolean isAlphaNum(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
//

    public static void StringSplit()
    {
        String s = "This is a // PowerShot. Total--755-runs$";

        String temp="";
        for(char x:s.toCharArray()){
            if(x!=' '){
                temp+=x;
            }else {
                if(temp!=""){
                    StringPrint(temp);
                    temp="";
                }
            }
        }

    }
    public static  void StringPrint(String s)
    {
        // This
        String temp="";
        for(int i=0;i<s.length();i++) // 4
        {
            char ch=s.charAt(i); // T h i s
            char next=(i<s.length()-1) ? s.charAt(i+1) : ' '; //h i s ""
            temp+=ch; //T

            if( /* lower case - > upper case  (break agu) */
                  // AnbuKumar mean u->K so break true  // temp = A
                    (ch>='a' && ch<='z' && next>='A' && next<='Z' ) ||

                 /* Digit -> Non - Digit (break agu)4 */
                   // Anbu780 -> Anbu - 780
                   (ch>='0' && ch<='9'  && !(next>='0' && next<='9')) ||

                 // Symbol break
                 /* : --755 → after --, next is number, so print “--”. */ // --75  i=0 - i=1 - i=2 - i=3 7
                            (!isAlphaNumerical(ch) && isAlphaNumerical(next)) ||

                 //  runs$ → after s, next is  // r u n  ch -> s  ---> next-> $
                            (isAlphaNumerical(ch)) && (!isAlphaNumerical(next))){
                System.out.println(temp);
                temp="";
            }
        }
        if(temp!=""){
            System.out.println(temp);
        }
    }

    public static  boolean isAlphaNumerical(char x){
        return (x>='a' && x<='z') || (x>='A' && x<='Z') || (x>='0' && x<='9');
    }
}
