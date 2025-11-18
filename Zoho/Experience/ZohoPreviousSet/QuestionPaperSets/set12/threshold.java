package set12;
/*
 * ceil(num/threshold)=thresholdnum+threshold−1​
 */
public class threshold {
    public static void main(String[] args) {
        int []arr={5,8,10,13,6,2};
        int tar=3;
        int total=0;
        for(int k:arr){
            total+=(k+tar-1)/tar;
        }
        System.out.println(total);
    }
}
