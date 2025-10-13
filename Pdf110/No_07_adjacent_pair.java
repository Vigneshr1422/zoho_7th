package Pdf110;

public class No_07_adjacent_pair {
    public static void main(String[] args) {
        String a="asdfghij";
        String b="adsfgijh";
        int i=0;
        StringBuilder ans=new StringBuilder();
        while(i<a.length()) {

            if(a.charAt(i)!=b.charAt(i))
            {
                int j=i;
                while(i<a.length() && a.charAt(i)!=b.charAt(i)){
                    i++;
                }

                if(!ans.isEmpty()) ans.append(", ");
                ans.append(a,j,i).append("-").append(b,j,i);
            }
            else {
                i++;
            }
        }
        System.out.println(ans);

    }
}
