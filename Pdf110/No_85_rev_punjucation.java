package Pdf110;

public class No_85_rev_punjucation {
    public static void main(String[] args) {
        String s = "house no : 123@ cbe";
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while(left < right){
            if(!Character.isLetterOrDigit(arr[left])){
                left++;
            } else if(!Character.isLetterOrDigit(arr[right])){
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println(new String(arr));
    }
}
