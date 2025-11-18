package set3;

public class recursion_reverse {
    public static void main(String[] args) {
        String a="one two three";
        System.out.println(reverses(a));
    }


    public static String reverses(String a)
    {
        int space=lastIndexOfFunction(a);
        if(space==-1){
            return a;
        }

        String first=subString_custom(a,0, space);
        String remain=subString_custom(a,space+1,a.length());

        return remain+" "+reverses(first);

    }

    public static int lastIndexOfFunction(String a)
    {
        int ans=-1;
        int n=a.length();
        for(int i=n-1;i>=0;i--)
        {
            if(a.charAt(i)==' '){
                ans=i;
                break;
            }
        }
        return ans;
    }

    public static String subString_custom(String a, int start, int end)
    {
        char ans[]=new char[end-start];
        for(int i=start;i<end;i++){
            ans[i-start]=a.charAt(i);
        }
        return new String(ans);
    }
}

/*
 * 
    public static String reverse(String a)
    {
        int space=a.lastIndexOf(" ");
        if(space==-1){
            return a;
        }

        String first=a.substring(0, space);
        String remain=a.substring(space+1);

        return remain+" "+reverse(first);

    }
 */