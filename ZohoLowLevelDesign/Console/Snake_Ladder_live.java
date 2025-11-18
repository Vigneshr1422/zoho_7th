//package ZohoLowLevelDesign.Console;
//import org.w3c.dom.Node;
//
//import java.util.*;
//public class Snake_Ladder_live {
//    public static void main(String[] args) {
//    SnakeGame snakeGame=new SnakeGame(6,6);
//    snakeGame.start();
//    }
//}
//class SnakeGame
//{
//    private final char[][] board;
//    private final Queue<Node>snakeBody=new LinkedList<>();
//    private final Queue<Node> foodQueue =new LinkedList<>();
//    private final Random random=new Random();
//    private int currentRow=0;
//    private int currentCol=0;
//    private char currentHead ='>';
//
//    public SnakeGame(int row,int col)
//    {
//        board=new char[row][col];
//        snakeBody.add(new Node(0,0));
//        board[0][0]=currentHead;
//        generateFoodPosition();
//
//    }
//
//    public void start()
//    {
//        Scanner in=new Scanner(System.in);
//        printBoard();
//        while(true)
//        {
//            System.out.println("Enter Move (U,D,L,R): ");
//            char move=in.next().toUpperCase().charAt(0);
//            if(makeMove(move))
//            {
//                printBoard;
//            }else
//            {
//                System.out.println("Over");
//                break;
//            }
//
//        }
//        in.close();
//    }
//
//    private boolean makeMove(char direction)
//    {
//        int newRow=currentRow,newCol=currentCol;
//        char newHead;
//        switch (direction)
//        {
//            case'U':newRow--;newHead='^';break;
//            case 'D':newRow++;newHead='v';break;
//            case 'L':newCol--;newHead='<';break;
//            case 'R':newCol++;newHead='>';break;
//            default:
//                System.out.println("Invalid move ! use U D L R");
//                return true;
//
//        }
//        if(!isValidMove(newRow))
//
//    }
//
//
//}
