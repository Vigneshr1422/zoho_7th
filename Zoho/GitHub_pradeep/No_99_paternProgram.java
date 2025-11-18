package Zoho.GitHub_pradeep;

public class No_99_paternProgram {

    public static void main(String[] args) {
        String a="PROGRAM";
        int k=3;
        System.out.println(a.substring(k));
        System.out.println(a.substring(0,k));
        String str=a.substring(k)+a.substring(0,k);
        int n=str.length();
        for(int i=1;i<=str.length();i++){

            for(int j=1;j<(n-i)*3;j++){
                System.out.print("-");
            }
            System.out.print(SubStringCustom(str, 0, i));
            // for(int j=0;j<(i-1);j++){
            //     System.out.print("-");
            // }
            System.out.println();

        }

    }
    public static String SubStringCustom(String str,int ss, int ee)
    {
        String ans="";

        for(int i=ss;i<ee;i++){
            ans+=str.charAt(i);
        }
        return ans;
    }

}
