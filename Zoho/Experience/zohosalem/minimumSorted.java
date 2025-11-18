package zohosalem;

public class minimumSorted {
    public static void main(String[] args) {
        int arr[]={5,1,2,3,4};
        int a[]={1,2,5,4,6};

        function(arr);
        function(a);
    }

    public static void function(int []arr)
    {
        int n=arr.length;
        int pass=0;
        boolean sort=false;
        while(!sort){
            sort=true;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1]){
                if(Math.abs(i-(arr[i]-1))>2){
                    System.out.println(-1);
                    return;
                }
                 int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sort = false;


            }
        }
        if(!sort){
            pass++;
        }
    }
    System.out.println(pass);
}
}
