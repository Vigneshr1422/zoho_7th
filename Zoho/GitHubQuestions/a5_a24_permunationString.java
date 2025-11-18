package GitHubQuestions;

public class a5_a24_permunationString {
    public static void main(String[] args) {
        String a="ABC";
        permute(a.toCharArray(),0);
        }

        public static  void permute(char []arr, int index)
        {
            if(index==arr.length)
            {
                System.out.println(new String (arr));
                return;
            }

            for(int i=index;i<arr.length;i++){
                swap(arr,i,index);
                permute(arr, index+1);
                swap(arr,i,index);
            }

        }
        public static void swap(char arr[],int i,int j)
        {
            char t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
}
