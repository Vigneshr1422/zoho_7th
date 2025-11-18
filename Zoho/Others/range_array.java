package Zoho.Others;
//day 2
public class range_array {
    public static void main(String[] args) {
        int []arr={1,2,13,15,6,8};
        int x=2;
        int y=14;


        for(int z:arr)
        {
            if(x<z && y>z)
            {
                System.out.println(z);
                break;
            }
        }
    }
}
