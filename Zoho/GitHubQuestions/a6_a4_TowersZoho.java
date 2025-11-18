package GitHubQuestions;

public class a6_a4_TowersZoho {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        int h1=6;
        int h2=15;

        bubblesort(arr);

        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;i<n;i++){
                for(int k=j+1;k<n;k++)
                   {
                    int sum1=arr[i]+arr[j]+arr[k];

                    if(sum1==h1){
                        int ans[]=new int[3];
                        int idex=0;

                        for(int w=0;i<n;w++){
                            if(w!=i && w!=j&& w!=k){
                                ans[idex++]=arr[w];
                            }

                            if(ans[0]+ans[1]+ans[2]==h2){
                                bubblesort(ans);
                                System.out.print(arr[i]+" "+arr[j]+" "+arr[k]+" &&"+ans[0]+" "+ans[1] +" "+ans[2]);
                                return;
                            }
                        }
                    }

                   }
            }
        }
    }

    public static void bubblesort(int []arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }
    
}
