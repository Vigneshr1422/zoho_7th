package KunalKushwaha.BinarySearch.Level1;

public class ceiling_char {
    public static void main(String[] args) {
        char []arr={'c','f','j'};
        int tar='f';
        System.out.println( ceilingFunction(arr,tar));
    }
    public  static  char ceilingFunction(char []arr,int tar)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]<tar){
                end=mid-1;
            }else
            {
                start=mid+1;
            }
        }
        return arr[start % arr.length];
    }
}
