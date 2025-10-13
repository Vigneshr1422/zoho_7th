package GitHub_pradeep;

public class No_22_LatinMatrix {
    public static void main(String[] args) {
        int N = 3;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                char c = (char) ('A' + (i+j)%N);
                System.out.print(c + "\t");
            }
            System.out.println();
        }
    }
}
