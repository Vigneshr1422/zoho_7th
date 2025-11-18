package GitHubQuestions;

public class a5_a2_gridMovement {
    public static void main(String[] args) {
        int x=4;
        int y=5;

        char[]arr={'U','L','R','R','D','D','U','L','R'};
        int up=0;
        int down=0;
        int left=0;
        int right=0;

        for(char w:arr)
        {
            if(w=='U') up++;
            else if(w=='L') left++;
            else if(w=='R') right++;
            else if(w=='U') up++;
            else if(w=='D') down++;

        }
        x=x+(right-left);
        y=y+(down-up);
        
        System.out.println(x+" "+y);
        }
    
}
