package Matrix_2D;

import java.util.*;

public class clockwise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  // rows
        int m = in.nextInt();  // cols

        int[][] arr = new int[n][m];
        int[][] arr1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
                arr1[i][j] = arr[i][j];
            }
        }

        System.out.println("Before Rotation:");
        printMatrix(arr1);
        oneShiftRight(arr1,n,m);
        oneShiftLeft(arr,n,m);
    }
public static void oneShiftLeft(int [][]arr,int n,int m)
{
        int top=0;
        int bot=n-1;
        int left=0;
        int right=m-1;

        int store=arr[bot][left];


        for(int i=bot;i>top;i--)
        {
            arr[i][left]=arr[i-1][left];
        }

        for(int i=left;i<right;i++)
        {
            arr[top][i]=arr[top][i+1];
        }

        for(int i=top;i<bot;i++)
        {
            arr[i][right]=arr[i+1][right];
        }

        for(int i=right;i>left+1;i--)
        {
            arr[bot][i]=arr[bot][i-1];
        }

        arr[bot][left+1]=store;
        System.out.println("After rotation one shift left  ");
        printMatrix(arr);
    }

    public static void oneShiftRight(int [][]arr,int n,int m)
    {

        int top = 0;
        int bot = n - 1;
        int left = 0;
        int right = m - 1;

        int store = arr[bot][left]; // Save last left-bottom corner

        // Move bottom row (left to right)
        for (int i = left; i < right; i++) {
            arr[bot][i] = arr[bot][i + 1];
        }

        // Move right column (bottom to top)
        for (int i = bot; i > top; i--) {
            arr[i][right] = arr[i - 1][right];
        }

        // Move top row (right to left)
        for (int i = right; i > left; i--) {
            arr[top][i] = arr[top][i - 1];
        }

        // Move left column (top to bottom)
        for (int i = top; i < bot - 1; i++) {
            arr[i][left] = arr[i + 1][left];
        }

        arr[bot - 1][left] = store; // Place stored value

        System.out.println("After rotation one shift right :");
        printMatrix(arr);
    }

    public static void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
    }
