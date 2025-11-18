package GitHubQuestions;

public class a8_a67_largest_possibleString {
    public static void main(String[] args) {
        int arr[]={54,546,548,60};
        String res=function(arr);
        System.out.println(res);
    }

    public static String function(int []arr)
    {
        String ans[]=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=String.valueOf(arr[i]);
        }

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                String ab=ans[j]+ans[j+1];
                String ba=ans[j+1]+ans[j];

                if(ab.compareTo(ba)<0)
                {
                    String x=ans[j];
                    ans[j]=ans[j+1];
                    ans[j+1]=x;
                }
                

            }


        }

        StringBuilder a=new StringBuilder();
        for(String x:ans){
            a.append(x);
        }
        return a.toString();
    }
    
}
