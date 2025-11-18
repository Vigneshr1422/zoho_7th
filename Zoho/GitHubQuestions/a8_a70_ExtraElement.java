package GitHubQuestions;

public class a8_a70_ExtraElement {
    public static void main(String[] args) {
        int arr1[]={-1,0,3,2};
        int []arr2={3,4,0,-1,2};
        
        int xor=0;

        for(int i:arr1) xor^=i;
        for(int i:arr2) xor^=i;

        for(int i=0;i<arr2.length;i++){
            if(arr2[i]==xor){
                System.out.println("Element found atindex "+ i+" Element is "+xor);
                return;
            }
        }

        System.out.println("No");


    }
    
}
