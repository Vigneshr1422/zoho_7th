package folders.set.set4;
public class ReverseStringKeepSpecial {
    public static void main(String[] args) {
        String input = "i! love: zoho";
        char[] arr = input.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(arr[left])) {
                left++;
            } else if (!Character.isLetterOrDigit(arr[right])) {
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