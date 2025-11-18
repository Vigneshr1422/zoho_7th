package Zoho.GitHub_pradeep;

public class No_105reverseWordSpecialCharacter {
        public static void main(String[] args) {
            String a="house no : 123@ kkdi";
            reversefun(a);
        }
        public static void reversefun(String a){
            char []arr=a.toCharArray();

            int i=0;
            int j=arr.length-1;

            while(i<j){
                if(letterFun(arr[i])){
                    i++;

                }else if(letterFun(arr[j])){
                    j--;
                }
                else{
                    char t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                    i++;
                    j--;
                }
            }

            System.err.println(new String(arr));
        }

    public static  boolean  letterFun(char y){
        String a="abcdefghijklmnopqrstuvwxyz";
        String b="0147852369";


        if(a.indexOf(y)!=-1){
            return false;
        }
        if(b.indexOf(y)!=-1){
            return false;
        }

        return true;
       }
}

