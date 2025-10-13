package Pdf110;

public class No_92_ReverseWordsInPlace_String {
    public static void main(String[] args) {
        char[] arr = "i.like.this.program.very.much".toCharArray();
        int n = arr.length;

        // 1. Reverse whole array
        reverse(arr, 0, n-1);

        // 2. Reverse each word individually
        int start = 0;
        for(int i = 0; i <= n; i++){
            if(i == n || arr[i] == '.'){
                reverse(arr, start, i-1);
                start = i + 1;
            }
        }

        System.out.println(new String(arr));
    }

    static void reverse(char[] arr, int l, int r){
        while(l < r){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++; r--;
        }
    }
}
