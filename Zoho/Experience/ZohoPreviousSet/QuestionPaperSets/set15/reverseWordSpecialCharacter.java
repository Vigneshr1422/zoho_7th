package set15;
public class reverseWordSpecialCharacter {
    public static void main(String[] args) {
        String a="house no : 123@ kkdi";
        reversefun(a);
    }
    public static void reversefun(String a){
        char arr[]=a.toCharArray();

        int i=0;
        int j=arr.length-1;

        while(i<j){
            if(!letterfun(arr[i])){
                i++;

            }else if(!letterfun(arr[j])){
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

    public static  boolean  letterfun(char y){
        String a="abcdefghijklmnopqrstuvwxyz";
        String b="0147852369";
   

            if(a.indexOf(y)!=-1){
                return true;
            }
            if(b.indexOf(y)!=-1){
                return true;
            }
        
        return false;
    }
    
}
