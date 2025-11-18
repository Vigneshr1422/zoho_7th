package set12;
public class binaryAddition{
public static void main(String[] args) {
    String a="101101";
    String b="1101";
    int base=0;
    System.out.println("First "+addbinary(a,b,base));  


     String aa="123";
    String bb="13";
    int bas=4;
    System.out.println("second"+addbinary(aa,bb,bas));  
}
public static String addbinary(String a,String b,int base){
    int bases= (base==0) ? 2 :base;
    StringBuilder ans=new StringBuilder();
    int i=a.length()-1;
    int j=b.length()-1;
    int carry =0;

    while(i>=0 || j>=0 || carry!=0){
        int bitA=(i>=0)? a.charAt(i)-'0' : 0;
        int bitB=(j>=0)? b.charAt(j)-'0' : 0;

        int sum=bitA+bitB+carry;

        ans.append(sum%bases);
        carry=sum/bases;
        i--;
        j--;
    }

    return ans.reverse().toString();
}
}