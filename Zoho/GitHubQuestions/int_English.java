package GitHubQuestions;

public class int_English {
     private static final String[] belowTwenty = { "", "One", "Two", 
                                                "Three", "Four", "Five", 
                                                "Six", "Seven", "Eight", 
                                                "Nine", "Ten", "Eleven", 
                                                "Twelve", "Thirteen", "Fourteen", 
                                                "Fifteen", "Sixteen", "Seventeen", 
                                                "Eighteen", "Nineteen"};

    private static final String[] tens = {"", "Ten", "Twenty", "Thirty",
                                           "Forty", "Fifty", "Sixty", "Seventy", 
                                           "Eighty", "Ninety"};

    private static final String[] thousdand = {"", "Thousand", "Million", "Billion"};
    public static void main(String[] args) {
        int n=145;
        System.out.println(function(n));

    }

    public static String function(int n){

        if(n==0){
            return "zero";
        }
        String word="";
        int index=0;
        while(n>0){
            if(n%1000!=0){
                word=helper(n%1000)+thousdand[index]+" "+word;
                        }
                        n/=1000;
                        index++;
        }

        return word.trim();
    }

    public static String helper(int n){

        if(n==0){
            return "";

        }
        else if(n<20){
            return belowTwenty[n];
        }else if(n<100){
            return tens[n/10]+" "+helper(n%10);
        }
        else
        return belowTwenty[n/100]+" Hundred " +helper(n%100);
    }
    
}
