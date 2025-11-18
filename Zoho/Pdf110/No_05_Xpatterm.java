package Zoho.Pdf110;

public class No_05_Xpatterm {
    public static void main(String[] args) {
       String a="program";
       for(int i=0;i<a.length();i++)
       {
           for(int j=0;j<a.length();j++)
           {
               if(i==j || i+j==a.length()-1){
                   System.out.print(a.charAt(i));
               }
               else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
    }
}
