package TopicVise.Maths_related;

public class sin {
    public static void main(String[] args) {
        double angle =30.0;
        int n=10;
        
        double radian= 3.14* angle / 180.0;
        double store=radian;
        double sum=store;

        for(int i=1;i<=n;i++){
            store*=-(radian* radian)/((2.0*i)*(2.0*1+1));
                        sum+=store;


        }
        System.out.println(sum);
    }
    
}
