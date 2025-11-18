package Zoho.Others;
//day 2
public class coco {
    public static void main(String[] args) {
        int []arr={4,6,7,11};
        int hour=8;
        int min=1;
        int max=0;
        for(int i:arr)
        {
            max=Math.max(i,max);
        }
        while(min<max)
        {
            int mid=min+(max-min)/2;
            if(cheak(arr,hour,mid))
            {
                max=mid;
            }
            else {
                min=mid+1;
            }
        }
        System.out.println(min);
    }
    static boolean cheak(int []arr,int hour,int speed) {
        int ans = 0;
        for (int i : arr) {
            ans += (int)Math.ceil((double) i/speed);
        }
        return ans<=hour;
    }
}
