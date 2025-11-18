package TopicVise.String_Problems;

public class add_number {
    public static void main(String[] args) {
        String a="1234";
        String b="34";


        int i=a.length()-1;
        int j=b.length()-1;
        int c=0;
        StringBuilder ans=new StringBuilder();

        while(i>=0 || j>=0 || c>0){
            int a1=(i>=0)?a.charAt(i)-'0' : 0;
            int b1=(j>=0)?b.charAt(j)-'0' : 0;
            int sum=a1+b1+c;

            System.out.println("Actuly Modulas "+ans.append(sum%10));
            System.out.println("Divide  happens "+  (c=sum/10));
            i--;
            j--;
        }
        for(int k=ans.length()-1;k>=0;k--){
            System.out.print(ans.charAt(k));
        }
    }
}
