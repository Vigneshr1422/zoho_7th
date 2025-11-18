package GitHubQuestions;

public class a8_a2_number_decimal {
    public static void main(String[] args) {
        int n=38;

        solve(n);


    }
    public static void solve(int n){
        int max=0;
        String str=String.valueOf(n);
        int arr[]=new int[str.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=str.charAt(i)-'0';
            if(max<arr[i]){
                max=arr[i];
            }
        }
        
        String ans[]=new String[max];
        for(int i=0;i<max;i++){
            ans[i]="";
        }

        int len=str.length();
        for(int i=0;i<len;i++){
            int d=str.charAt(i)-'0';

            for(int j=0;j<max;j++){
                if(d>j){
                    ans[j]+="1";
                }else
                {
                    ans[j]+="0";
                }
            }
        }

        for(int i=0;i<max;i++){
        System.out.print(Integer.parseInt(ans[i])+" ");
        }

    }
}