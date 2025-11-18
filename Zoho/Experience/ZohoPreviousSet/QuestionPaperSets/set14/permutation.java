package set14;

public class permutation {
    public static void main(String[] args) {
        String a="ABC";
        int n=a.length();

        for(int i=0;i<=n;i++){
            generatePermutation(a,"",i);
        }

    }

    public static void generatePermutation(String str,String ans,int index){
        if(ans.length()==index){
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String x=str.substring(0, i)+str.substring(i+1);
            generatePermutation(x, ans+ch, index);
        }

    }
    
}
