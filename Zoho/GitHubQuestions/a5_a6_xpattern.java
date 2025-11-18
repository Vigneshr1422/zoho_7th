package GitHubQuestions;
public class a5_a6_xpattern {
    public static void main(String[] args) {
        String a="ZohoCorporation";

         char []arr=a.toCharArray();
        for(int i=0;i<a.length();i++)
        {
            for(int j=0;j<a.length();j++)
            {
                if(i==j || (i+j==a.length()-1)){
                    System.out.print(arr[i]);
                }else{
                    System.out.print(" ");
                }
            }
                            System.out.println();

        }
    }

    public static char charAt(String a, int i){
        char arr[]=a.toCharArray();
        return arr[i];
    }
    
}
