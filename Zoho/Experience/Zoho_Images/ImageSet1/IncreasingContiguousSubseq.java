package Zoho.Experience.Zoho_Images.ImageSet1;

public class IncreasingContiguousSubseq {
    public static void main(String[] args) {
        int []arr={4,6,7,7};

        function(arr);
    }
    public static void function(int []arr)
    {
        int n=arr.length;

        for(int i=0;i<n-1;i++)
        {
            StringBuilder ans=new StringBuilder();
            ans.append(arr[i]).append(" ");
            for(int j=i+1;j<n;j++)
            {
                if(arr[j-1]<=arr[j]){
                    ans.append(arr[j]).append(" ");
                    if(j-i+1>=2){
                        System.out.println(ans);
                    }else {
                        break;
                    }
                }
            }
        }
    }
}
