package Build_in;

public class SubStringCustom {
 public static void main(String[] args) {
  String a = "abc";

  for (int i = 0; i < a.length(); i++) {
   String x = "";
   for (int j = i; j < a.length(); j++) {
    x += a.charAt(j);
    System.out.println(x);
   }
  }

 }

}
