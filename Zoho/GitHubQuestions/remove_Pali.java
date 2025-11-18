package GitHubQuestions;

public class remove_Pali {
	public static void main(String[] args) {
        
        String str="malayalam is the mother tounge";
        
        function(str);
        
    }
    
    public static void function(String str){
        
        String []arr=str.split("\\s+");
        String ans="";
        for(String x:arr){
            if(!isPali(x)){
                ans+=x+" ";
            }
        }
        
        System.out.println(ans);
    }
    
    public static boolean isPali(String str)
    {
        int start=0;
        int end=str.length()-1;
       
       
        while(start<end)
        {
            if(str.charAt(start)!=str.charAt(end)){
                
                return false;
            }
            start++;
                end--;
        }
        return true;
    }
}
