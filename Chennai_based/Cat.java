package Chennai_based;

public class Cat {
    public static void main(String[] args) {
        int []arr={3,14,5,7,16,19,18};
        int speed=4;
        int limit=3;

        System.out.println(function(arr,speed,limit));
    }
    public static int function(int []arr,int speed, int limit)
    {
        int catSpeed=0;
        int catDistance=0;
        int time=0;
        boolean isContinue=true;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==catDistance){
                return time;
            }
            if(i==0 ){
                catSpeed=speed;
            }
            if(limit<=time && isContinue){
                catSpeed/=2;
                isContinue=false;
            }
            catDistance+=catSpeed;
            time++;
            System.out.print("cat speed     = "+catSpeed);
            System.out.print(" | ");
            System.out.print("cat Distance  = "+catDistance);
            System.out.print(" | ");
            System.out.print("Time          = "+time);
            System.out.println();
        }
        return -1;
    }
}
