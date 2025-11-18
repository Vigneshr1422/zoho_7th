package set13;

public class binary_decimal {

    public static void main(String[] args) {
        int n=32;

        String str=String.valueOf(n);
        int max=0;
        int arr[]=new int[str.length()];

        for(int i=0;i<arr.length;i++){
            arr[i]=str.charAt(i)-'0';
            if(arr[i]>max){
                max=arr[i];
            }
        }

        String ans[]=new String[max];

        for(int i=0;i<max;i++){
            ans[i]="";
        }

        for(int i=0;i<str.length();i++){
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
            System.out.println(Integer.parseInt(ans[i])+" ");
        }
    }
}
