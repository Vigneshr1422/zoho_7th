package set99;

public class String_rotation {
    public static void main(String[] args) {
        String a="abcd";
        String b="bcda";

       boolean ans= isRotation(a,b);
       System.out.println(ans);

       optimal(a,b);
    }

    public static boolean isRotation(String a , String b){
        return (a+a).contains(b);
    }
    public static void optimal(String a,String b){
        if(a.length()!=b.length())
        {System.out.println("false");
        return ;
    }
    int n=a.length();

    for(int i=0;i<n;i++){
        boolean k=true;

        for(int j=0;j<n;j++){
            if(a.charAt((i+j)%n) !=b.charAt(j)){
                k=false;
                break;
            }
        }
        
    if(k){
        System.out.println("true");
        return;
    }
    }

    System.out.println("False");

    }
}
