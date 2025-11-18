package Zoho.GitHub_pradeep;

public class No_24_StringPermutations {
    public static void main(String[] args) {
        String s = "ABC";
        permute(s.toCharArray(), 0);
    }

    private static void permute(char[] arr, int index){
        if(index == arr.length){
            System.out.println(new String(arr));
            return;
        }
        for(int i=index;i<arr.length;i++){
            swap(arr, i, index);
            permute(arr, index+1);
            swap(arr, i, index); // backtrack
        }
    }

    private static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
