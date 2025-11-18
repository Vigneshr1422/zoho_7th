package Zoho.Experience.ZohoPreviousSet.DriveSet.Set20;

public class StringSwap {
    public static void main(String[] args) {
        String a="ab";
        String b="ba";

        StringFunction(a,b);
    }

    public static void StringFunction(String a,String b)
    {
      String ans="";
      ans+=a.charAt(1);
      ans+=a.charAt(0);
    boolean isCorrect=true;
      for(int i=0;i<b.length();i++)
      {
          if(ans.charAt(i)!=b.charAt(i)){
              System.out.println("Not Correct ");
              isCorrect=false;
              break;
          }
      }

      if(isCorrect) {
          System.out.println("Correct");
      }

    }
}
