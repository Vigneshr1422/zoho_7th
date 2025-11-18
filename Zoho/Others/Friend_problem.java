package Zoho.Others;

import java.util.*;
public class Friend_problem {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int total=in.nextInt();
       in.nextLine();
       HashSet<String>direct=new HashSet<>();
       HashSet<String >suggest=new HashSet<>();

       for(int i=0;i<total;i++) {
           System.out.println("Frind name : count : your friend");
           String fr = in.nextLine();
           String[] part = fr.split(" ");
           direct.add(part[0]);
           int numFrnd = Integer.parseInt(part[1]);


           for (int j = 2; j < 2 + numFrnd; j++) {
               if (!direct.contains(part[j])) {
                   suggest.add(part[j]);
               }
           }
       }


           for (String x:direct)
           {
               if(suggest.contains(x))
               {
                   suggest.remove(x);
               }
           }

        for (String x:suggest)
        {
            System.out.print(x+" ");
        }



    }
    }

