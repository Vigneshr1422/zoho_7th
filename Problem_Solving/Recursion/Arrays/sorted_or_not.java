package Problem_Solving.Recursion.Arrays;

public class sorted_or_not {
    public static void main(String[] args) {
        int []arr={1,2,1,4};
        if(check(arr,0)) {
            System.out.println("True");
            return;
        }
        else
        {
            System.out.println("False");
        }
    }

    public static  boolean check(int []arr,int index)
    {


          if(index==arr.length-1)
          {
              return true;  // base case
          }

          return arr[index]<arr[index+1] && check(arr,index+1);

    }
}
