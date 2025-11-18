package Zoho.GitHub_pradeep;

public class No_88_MaxKDigitManualSort {
    public static void main(String[] args) {
        int []ar={1,4,973,97};
        String []arr=new String[ar.length];
        int k=3;
        int in=0;
        for(int i:ar)
        {
            arr[in++]=String.valueOf(i);
        }
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(!CompareString(arr[j], arr[j+1])){
                    String t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        String ans="";
        for(String x:arr)
        {
            ans+=x;
        }

        if(k<ans.length()){
            System.out.println(ans.substring(0,k));
        } else {
            System.out.println(ans);
        }
    }

    public static boolean CompareString(String a, String b) {
        String ab = a + b;
        String ba = b + a;
        for(int i=0;i<ab.length();i++){
            char x = ab.charAt(i);
            char y = ba.charAt(i);
            if(x > y) return true;
            if(x < y) return false;
        }
        return false;
    }
}
