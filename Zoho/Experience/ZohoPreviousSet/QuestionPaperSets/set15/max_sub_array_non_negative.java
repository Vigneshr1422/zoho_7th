package set15;

public class max_sub_array_non_negative {
    public static void main(String[] args) {
        int arr[]={2, -7, 5, -1, 3, 2, -9, 7};
        int start=0;
        int end=0;
        int tmpstart=0;
        int currentsum=0;
        int maxsu=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                currentsum+=arr[i];

                if(currentsum>maxsu){
                    maxsu=currentsum;
                    start=tmpstart;
                    end=i;
                }
            }
            else{
                    currentsum=0;
                    tmpstart=i+1;
                }

        }
        System.out.println(maxsu);
    }
    
}
