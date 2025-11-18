package Zoho.GitHub_pradeep;

public class No_110_freq {
    public static void main(String[] args) {
        int []arr={1,2,4,2,5,3,8,7};
        int []freq=new int[9];
        for(int i:arr)
        {
            freq[i]++;
        }
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>0){
                System.out.println(i+" ----> "+freq[i]);
            }
        }
        preserveOrder();
    }

    public static void preserveOrder()
    {
        int []arr={1,2,3,4,5,2,1,2};
        int []freq=new int[9];
        boolean []c=new boolean[9];
        for(int i:arr) freq[i]++;
        for(int i=0;i<arr.length;i++)
        {
            if(!c[arr[i]]){
                System.out.println(i+"--->"+freq[i]);
                c[i]=true;
            }
        }

    }
}
