package Zoho.GitHub_pradeep;

public class No_96_minimum_time {
        public static void main(String[] args) {
            int a=5;
            int b=4;
            int res=0;
            while(b>0){
                if(b%2==1){
                    res=res+a;
                }
                a=a+a;
                b=b/2;
            }
            System.out.println(res);
        }
    }

/*

4. Write function to find multipication of 2 numbers using +
operator You must use minimu possible iterations.
Input: 3,4
Output 12
(Russian peasant multiplication)
 */
