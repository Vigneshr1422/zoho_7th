package GitHub_pradeep;

public class No_23_MinSumBinaryDigits {
    public static void main(String[] args) {
        int N = 33;
        System.out.println("Minimum count: " + minCount(N));
    }

    public static int minCount(int N){
        int count = 0;
        while(N > 0){
            int x = largestBinaryDigitNumber(N);
            N -= x;
            count++;
        }
        return count;
    }

    private static int largestBinaryDigitNumber(int N){
        int num = 0, place = 1;
        int temp = N;
        while(temp > 0){
            int digit = temp % 10;
            if(digit >= 1) num += place;
            temp /= 10;
            place *= 10;
        }
        return num;
    }
}

