package ZohoLowLevelDesign.Console;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {

        // just 3 * 3 grid creation

        char [][]board=new char[3][3];

        for(int row=0;row<board.length;row++)
        {
            for(int col=0;col<board[row].length;col++)
            {
                board[row][col]=' ';
            }
        }

        // player ok

        char player = 'X';
        boolean gameOver=false;
        Scanner in=new Scanner(System.in);

        while(!gameOver)
        {
            printBoard(board);
            System.out.println("Player "+player+" 0 and 1 and 2 ");
            int row;
            int col;
            while (true) {
                row = in.nextInt();
                col = in.nextInt();
                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') break;
                System.out.println("Invalid or taken. Try again.");
            }

            board[row][col]=player;
            gameOver=HaveWon(board,player);

            if(gameOver)
            {
                printBoard(board);
                System.out.println("Player "+player+" has won");
            }
            else if(isDraw(board))
            {
                printBoard(board);
                System.out.println("Draw");
                break;
            }
            else
            {
                player=(player=='X')?'0' : 'X';
            }

        }
    }

    public static boolean HaveWon(char [][]board,char player)
    {
        for(int row=0;row<board.length;row++)
        {
            if(board[row][0] == player && board[row][1] == player && board[row][2]==player)
            {
                return true;
            }

        }

        for(int col=0;col<board[0].length;col++)
        {
            if(board[0][col] == player && board[1][col] == player && board[2][col]==player)
            {
                return true;
            }
        }

        if(board[0][0] == player && board[1][1]==player && board[2][2]==player)
        {
            return  true;
        }

        if(board[0][2] == player && board[1][1]==player && board[2][0]==player)
        {
            return  true;
        }
        return  false;
    }

    public static void printBoard(char [][]board)
    {
        for(int row=0;row<board.length;row++)
        {
            for(int col=0;col<board[row].length;col++)
            {
                System.out.print(board[row][col]+" | ");
            }
            System.out.println();
        }
    }

    public static boolean isDraw(char [][]board)
    {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == ' ')
                    return false;
            }
        }
        return true;

    }
}
