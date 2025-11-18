package Problem_Solving.Build_In;

public class power {
    public static void main(String[] args) {
        int a=5;
        int b=-3;

        System.out.println("Mathemetics.power  of 5 and 3 is "+pow(a,b));

    }
    public  static double pow(int x,int y)
    {
        if(y==0) return 1;
        boolean neg=false;
        if(y<0){
            neg=true;
            y=-y;
        }
        double res=1;
        double now=x;
        while (0<y)
        {
            if(y%2==1)
            {
                  res=res*now;
            }
            now=now*now;
            y/=2;
        }

        return  neg?1.0/res : res;
    }
}
