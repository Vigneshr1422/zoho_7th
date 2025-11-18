package Build_in;

public class Integer_parseInt {
    public static void main(String[] args) {
        String a="125";
        System.out.println(custom(a)+1);
    }

    public static int custom(String str){
        int ans=0;
        boolean neg=false;
        int i=0;
        if(str.charAt(0)=='-'){
            i++;
            neg=true;
        }

        for(;i<str.length();i++)
        {
             char x=str.charAt(i);
            int rem=x-'0';
            ans=ans*10+rem;
        }

        return neg?-ans : ans;
    }
    
}
