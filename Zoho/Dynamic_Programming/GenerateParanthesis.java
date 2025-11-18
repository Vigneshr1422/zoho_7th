package Dynamic_Programming;

public class GenerateParanthesis {
    public static void main(String[] args) {
        int n=2;
        generate(n,0,0,"");
    }

    public static void generate(int n, int start, int end, String ans)
    {
        if(ans.length()==2*n){
            System.out.println(ans);
            return;
        }

        if(start<n){
            generate(n, start+1, end, ans+"(");
        }
        if(end<start)
        {
            generate(n, start, end+1, ans+")");
        }
    }
}
