package GitHubQuestions;

public class StringStar {
    public static void main(String[] args) {
        String str = "Today   is  wednesda"; // length = 20

        // Count only alphabets
        int letterCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                letterCount++;
            }
        }

        // Total spaces = total length - letters
        int totalSpaces = str.length() - letterCount;

        // Split words
        String[] words = str.trim().split("\\s+");

        int gaps = words.length - 1;  // number of spaces between words
        int minStars = totalSpaces / gaps;
        int extraStars = totalSpaces % gaps;

        // Build final string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            result.append(words[i]);
            if (i < gaps) {
                for (int j = 0; j < minStars; j++) result.append("*");
                if (extraStars > 0) {
                    result.append("*");
                    extraStars--;
                }
            }
        }

        System.out.println(result.toString());
    }
}
/*''
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

public class Main
{
	public static void main(String[] args) {
        String a="Today   is  wednesda";
        int lettercount=0;
        int spacecount=0;
        for(char x:a.toCharArray()){
            if(x>='A' && x<='Z' || x>='a' && x<='z'){
                lettercount++;
            }else
            {
                spacecount++;
            }
        }
        
        String arr[]=a.split("\\s+");
        
        int gap=arr.length-1;
        
        int minstar=spacecount/gap; //5/2  =- 2 
        int extraStar=spacecount%gap; // 1
        
        StringBuilder ans=new StringBuilder();
        
        for(int i=0;i<arr.length;i++){
            ans.append(arr[i]);
            if(i<gap)
            {
                for(int j=0;j<minstar;j++){
                    ans.append("*");
                }
                
                if(extraStar>0){
                    ans.append("*");
                    extraStar--;
                }
            }
        }
        
        System.out.println(ans.toString());
        
	}
}
 

 */