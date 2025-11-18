package set14;

public class alpha {
    public static void main(String args[]){
        int n=27;
        StringBuilder ans=new StringBuilder();
        while(n>0){
            n--;
            char x=(char)('A'+(n%26));
            ans.append(x);
            n/=26;

        }
        System.out.println(ans);
    }
    
}
