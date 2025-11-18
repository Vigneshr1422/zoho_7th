package set12;

public class perfectSquare {
    public static void main(String[] args) {
        int a=10;
        int b=200;

        for(int i=1;i*i<=b;i++){
            if(a<i*i){
                System.out.println(i*i+" ");
            }
        }
    }
    
}
