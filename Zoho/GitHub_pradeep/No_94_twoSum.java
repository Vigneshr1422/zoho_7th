package Zoho.GitHub_pradeep;

public class No_94_twoSum {
        public static void main(String[] args) {
            int []arr={1,3,4,5,7};
            int t=4;

            if(function(arr,t)){
                System.out.println("True");
            }else{
                System.out.println(
                        "Not valid"
                );
            }
            if(fun(arr,t)){
                System.out.println("True");
            }else{
                System.out.println(
                        "Not valid"
                );
            }
        }

        public static boolean function(int []arr, int t){
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]+arr[j]==t){
                        return true;
                    }
                }
            }
            return false;
        }




        public static boolean fun(int []arr, int t){
            int start=0;
            int end=arr.length-1;

            while(start<end){
                int sum=arr[start]+arr[end];

                if(sum==t){
                    return true;
                }
                if(sum<t){
                    start++;
                }else
                {
                    end--;
                }
            }
            return false;
        }

    }

/*
2. Given sorted array check if two numbers sı
in it
a given
value
Input
Array = {1 3 4 8 10 } N = 7
output
True;

 */
