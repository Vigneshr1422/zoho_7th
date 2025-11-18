package Chennai_based;

public class count_1_in_num {
    public static void main(String[] args) {

        int n = 5;
        int c = 0;
        while (n != 0) {
            n = n & (n - 1);
            c++;
        }
        System.out.println(c);
    }
}
