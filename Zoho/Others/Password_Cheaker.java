package Zoho.Others;

public class Password_Cheaker {
    public static void main(String[] args) {
        String a="Qwerty@123";
        check(a);
    }

    public static void check(String a) {
        boolean isnum=false;
        boolean isUpper=false;
        boolean isLower=false;
        boolean isSpecial=false;
        String special="~!@#$%^&*";

            for(char x:a.toCharArray())
            {
                if(Character.isDigit(x)){
                    isnum=true;
                }
                if(Character.isUpperCase(x))
                {
                    isUpper=true;
                }
                if(Character.isLowerCase(x))
                {
                    isLower=true;
                }
                if(special.contains(new String(String.valueOf(x))))
                {
                    isSpecial=true;
                }
            }
            int count=0;
        if(isUpper)count++;
        if(isnum) count++;
        if(isLower)count++;
        if(isSpecial)count++;

        if (count == 4) System.out.println("Strong");
        else if (count == 3) System.out.println("Good");
        else if (count == 2) System.out.println("Medium");
        else System.out.println("Weak");

    }
}
