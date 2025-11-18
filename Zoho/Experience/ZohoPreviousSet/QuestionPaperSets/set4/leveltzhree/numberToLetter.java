package set4.leveltzhree;

public class numberToLetter {
    public static void main(String[] args) {
        int n=17;
        System.out.println("answer "+function(n));
    }
    public static String function(int n){
        char []arr=new char[10];

        int idx=0;
        while(n>0){
            n--;
            arr[idx++]=(char)('A'+(n%26));
            n/=26;
        }
        StringBuilder res=new StringBuilder();

        for(int i=idx-1;i>=0;i--){
            res.append(arr[i]);
        }
        return res.toString();
    }
}
