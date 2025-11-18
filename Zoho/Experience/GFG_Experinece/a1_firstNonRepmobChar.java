package Zoho.Experience.GFG_Experinece;


public class a1_firstNonRepmobChar{
    public static void main(String[] args) {
        String str="swiss";
        char res=function(str);
        if(res!=0)
        {
            System.out.println(res);
        }else
        {
            System.out.println("No bro");
        }


    }

    public static char function(String str)
    {
        int c[]=new int[256];
        for(char x:str.toCharArray()){
            c[x]++;
        }

        for(char x:str.toCharArray()){
            if(c[x]==1)
            {
                return x;
            }
        }

        return 0;
    }
}