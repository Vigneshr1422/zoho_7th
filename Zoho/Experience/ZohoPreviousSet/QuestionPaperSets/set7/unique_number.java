package set7;

public class unique_number {
    public static void main(String[] args) {
        int num=14785547;

        int []arr=new int[20];
        boolean []check=new boolean[10];

        int tmp=num;
        int l=0;
        while(tmp>0){
            arr[l++]=tmp%10;
            tmp/=10;
        }

        StringBuilder ans=new StringBuilder();

       for(int i=l-1;i>=0;i--){
            int d=arr[i];

            if(!check[d]){
                check[d]=true;
                ans.append(d);
            }
       }

       System.out.println(ans.toString());


    }
}
