package GitHubQuestions;

public class a5_a30_pangram {
    public static void main(String[] args) {
        String a="qwertyuioplkhgfdsazxcvbnm,";
        boolean []arr=new boolean[26];

        for(char x:a.toCharArray())
        {
            if(x>='a' && x<='z' || x>='A' && x<='Z')
            {                
                arr[x-'a']=true;
            }else if(x>='a' && x<='z' || x>='A' && x<='Z')
            {                
                arr[x-'a']=true;
            }
        }

        for(boolean f:arr)
        {
            if(!f)
            {
                System.out.println("Not pantram");
                return;
            }
        }

        System.out.println("pangram");
    }
}
