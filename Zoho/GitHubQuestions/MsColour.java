package GitHubQuestions;

public class MsColour {
    public static void main(String[] args) {
        int [][]arr={
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 0, 0},
            {1, 0, 0, 1, 1, 0, 1, 1},
            {1, 2, 2, 2, 2, 0, 1, 0},
            {1, 1, 1, 2, 2, 0, 1, 0},
            {1, 1, 1, 2, 2, 2, 2, 0},
            {1, 1, 1, 1, 1, 2, 1, 1},
            {1, 1, 1, 1, 1, 2, 2, 1}
        };

        int x=4;
        int y=4;
        int newColour=3;

        floodFill(arr,x,y,newColour);

        for(int []a:arr)
        {
            for(int k:a){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

    public static  void floodFill(int [][]arr,int x,int y, int newColur)
    {
        int oldColour=arr[x][y];
        if(oldColour==newColur){
         return;   
        }

        fill(arr,x,y,oldColour,newColur);
    }

    public static void fill(int [][]arr,int x,int y,int oldColour,int newColour)
    {
        int n=arr.length;
        int m=arr[0].length;

        if(x<0 || x>=n || y<0 || y>=m)
        {
            return;
        }
        if(arr[x][y]!=oldColour){
            return;
        }

        arr[x][y]=newColour;

        fill(arr, x+1, y, oldColour, newColour);
        fill(arr, x-1, y, oldColour, newColour);
        fill(arr, x, y+1, oldColour, newColour);
        fill(arr, x, y-1, oldColour, newColour);
    }
}
