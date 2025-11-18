package ZohoLowLevelDesign.Console.Maze_Runner;
import java.util.*;
public class shortest_Path_Program {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Size ");
        int size=in.nextInt();
        int n=size;
        int m=size;

        char [][]arr=new char[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]='-';
            }
        }

        System.out.println("Enter adventure value ");
        int ar=in.nextInt();
        int ac=in.nextInt();

        arr[ar][ac]='A';

        System.out.println("Enter Destination value ");
        int dr=in.nextInt();
        int dc=in.nextInt();

        arr[dr][dc]='D';

        System.out.println("Matrix");

        for(char []x:arr)
        {
            for(char y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }

        int shortestPath=findShortestPath(ar,ac,dr,dc);
        System.out.println(shortestPath);
    }

    private static int findShortestPath(int ar, int ac, int dr, int dc) {
    int x=Math.abs(dr-ar);
    int y=Math.abs(dc-ac);
    return  Math.max(x,y);
    }
}
