package Zoho.Pdf110;

public class No_88_NumberToAlphabet {
    public static void main(String[] args) {
        int[] numbers = {1, 26, 27, 676, 703};
        for(int num : numbers){
            System.out.println(num + " -> " + convert(num));
        }
    }

    static String convert(int num){
        StringBuilder sb = new StringBuilder();
        while(num > 0){
            num--; // 1-based to 0-based
            char ch = (char)('A' + num % 26);
            sb.insert(0, ch); // append at front
            num /= 26;
        }
        return sb.toString();
    }
}
