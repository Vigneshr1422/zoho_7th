package Patters;
/*
1 
1 2
1 2 3
1 2 3 4
1 2 3 4 5
opposite
--------1
------2 1
----3 2 1
--4 3 2 1
5 4 3 2 1
PS D:\Java_Vs_Code> 
 */
public class p1 {
    public static void main(String[] args) {
       int n=5;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
       }

       System.out.println("opposite");
       opposite();
        }

        public static void opposite(){
            int n=5;
            for(int i=1;i<=n;i++){

                for(int s=1;s<=n-i;s++){
                    System.out.print("--");
                }
                for(int j=i;j>=1;j--){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    
}
