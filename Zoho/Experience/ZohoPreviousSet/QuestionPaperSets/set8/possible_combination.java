 package set8;

class possible_combination {
public static void main(String[] args) {
    String a="ABC";
    generateCombination(a,"");
}
    public static void generateCombination(String a, String ans){
        if(!ans.isEmpty()){
            System.out.println(ans);
        }
        for(int i=0;i<a.length();i++){
            String subString=customFunction(a,i+1);
            generateCombination(subString, ans+a.charAt(i));
        }
    }

    public static String customFunction(String a,int start){
        String res="";
        for(int i=start;i<a.length();i++)
        {
            res+=a.charAt(i);
        }
        return res;
    }
}