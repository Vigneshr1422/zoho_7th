package KunalKushwaha.BinarySearch.Level1;

public class MountainArray_targetFind {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 6, 4, 2};
        int tar=6;
        System.out.println(findtarMount(arr,tar));
      //  System.out.println(Function());
    }

    public static  int findtarMount(int []arr,int tar){
        int peak=Peak_Index_in_Mountain_Array.peakFunction(arr);
        int ans=BinarySearchFor_Peak(arr,tar,0,peak,true);
        if(ans!=-1){
            return  ans;
        }
        return  BinarySearchFor_Peak(arr,tar,peak+1,arr.length-1,false);
    }

    public static int BinarySearchFor_Peak(int []arr,int tar,int s, int e, boolean check){

        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==tar) return m;
            if(check){
                if(arr[m]<tar){
                    s=m+1;
                }else{
                    e=m-1;
                }
            }else{
                if(arr[m]>tar){
                    s=m+1;
                }else{
                    e=m-1;
                }

            }
        }
        return -1;
    }
}
