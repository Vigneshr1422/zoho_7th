package Zoho.Others;

public class remove_pali {
    public static void main(String[] args) {
        String a="This is malayalam bro";
        StringBuilder ans=new StringBuilder();
        String []store=a.split(" ");
        for(int i=0;i<store.length;i++)
        {
            if((pali(store[i])))
            {
            }
            else
            {
                ans.append(store[i]).append(" ");

            }
        }
        System.out.println(ans);

    }
    public static boolean pali(String str)
    {
        int s=0;
        int e=str.length()-1;

        while(s<=e)
        {
            if(str.charAt(s)!=str.charAt(e))
            {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
