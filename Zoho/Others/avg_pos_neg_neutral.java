package Zoho.Others;

public class avg_pos_neg_neutral {
    public static void main(String[] args) {


        int[] arr = {2, 1, 0, -8, -9};
        float pos = 0;
        float neg = 0;
        float neo = 0;

           for (int i = 0; i <arr.length;i++)
           {
               if(arr[i]>0)
               {
                   pos++;
               }else if(arr[i]<0)
               {
                   neg++;
               }else
               {
                   neo++;
               }
           }
        System.out.println(pos/arr.length+","+neg/arr.length+","+neo/arr.length);
    }
}
