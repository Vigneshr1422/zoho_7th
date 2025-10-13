package Pdf110;
/*
An IPv4 address must satisfy:
It should have exactly 4 parts separated by ".".
Each part should be a number between 0 and 255.
Leading zeros are not allowed (except the number 0 itself).
No extra characters, spaces, or empty parts.
 */
/*
8 parts, separated by ":"
Each part must be 1 to 4 hex digits (0–9, a–f, A–F)
Leading zeros allowed
 */
public class No_48Validate_IP {
    public static void main(String[] args) {
        String a="192.168.0.1";
        String b="2001:db8:85a3:0:0:8A2E:0370:7334";
        System.out.println(isValidateIP4(a));
        System.out.println(isValidateIP6(b));
    }
    public static Boolean isValidateIP4(String a)
    {
        String []arr=a.split("\\.");
        if(arr.length!=4) return false;
        for(String i:arr)
        {
            if(i.isEmpty()) return false;
            for(char x:i.toCharArray()){
                if(!Character.isDigit(x)) return false;
            }
            if(i.length()>1 && i.charAt(0)=='0') return false;
            int num=Integer.parseInt(i);
            if(num<0 || num >255) return  false;
        }
        return true;
    }
    public static boolean isValidateIP6(String a)
    {
        String []arr=a.split(":");
        if(arr.length!=8) return false;
        for(String i:arr)
        {
            if(i.length()<1|| i.length()>4) return false;
            for(char x:i.toCharArray())
            {
                if (!(Character.isDigit(x) || (x>='a'&& x<='f') || (x>='A' && x<='F'))){
                return false;
                }
            }
        }
        return true;
    }
}
