package GitHubQuestions;

public class a8_a72_leastPrime {
    public static void main(String[] args) {
        int arr1[]={20,7};
        int arr2[]={11,5};

        for(int i=0;i<2;i++)
        {
            System.out.println(function(arr1[i],arr2[i]));
        }        
    }
    public static int function(int a,int b)
    {
        for(int i=1;i<=1000;i++){
            if(isPrime(i))
            {
                if((a+i)%b==0){
                    return i;
                }
            }
        }
        return -1;
    }

    public static boolean isPrime(int n)
    {
        if(n==1) return true;
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }

    
}
