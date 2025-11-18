package Zoho.GitHub_pradeep;

public class No_71_Extra_Element {
    public static void main(String[] args) {
        int []arr={10,20,30,40,12};
        int []arr2={10,20,30,40};

        int x=0;

        for(int i:arr)
        {
            x^=i;
        }

        for (int i:arr2)
        {
            x^=i;
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                System.out.println(x+" "+" index"+i);
                break;
            }
        }
        System.out.println("no da");
    }
}
