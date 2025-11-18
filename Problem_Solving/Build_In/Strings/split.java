package Problem_Solving.Build_In.Strings;

import java.util.ArrayList;

public class split {
    public static void main(String[] args) {
        String a="Hi da baby boy";
        String space=" ";
        String temp="";
        ArrayList<String>store= new ArrayList<>();
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!=' '){
                temp+=a.charAt(i);
            }
            else {
                if (!(temp.isEmpty())) {

                    store.add(temp);
                    temp = "";
                }
            }
        }



        System.out.println(store);
    }
}
