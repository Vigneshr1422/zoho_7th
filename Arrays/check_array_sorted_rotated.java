package Arrays;

public class check_array_sorted_rotated {
    public static void main(String[] args) {
        int []arr={3,4,5,1,2};
        int c=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[(i+1)%arr.length])
            {
                c++;
            }
        }

        System.out.println(c<=1 ? "True": "false");
    }
}
