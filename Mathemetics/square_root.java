package Mathemetics;
import java.util.*;
public class square_root {
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a number ");
    double n=in.nextInt();

    double ans;
    double sqrtnumber=n/2;
    do{
        ans=sqrtnumber;
        sqrtnumber=(ans+(n/ans))/2;
    } while((ans-sqrtnumber)!=0);
    System.out.println("value is " +sqrtnumber);
    in.close();
}
    
}
