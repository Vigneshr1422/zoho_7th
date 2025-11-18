package Zoho.Experience.Zoho_Images.ImageSet1;

public class goalParser {
 public static void main(String[] args) {
    String a="G()(AL)";
    StringBuilder ans=new StringBuilder();

    for(int i=0;i<a.length();i++)
    {
        if(a.charAt(i)=='G') ans.append('G');
        else if(a.charAt(i)=='('){
            if(a.charAt(i+1)==')'){
                ans.append('o');
                i++;
            }
            else
            {
                ans.append("al");
                i+=3;
            }
        }
    }
    System.out.println(ans.toString());
 }   
}
