package ZohoLowLevelDesign.Low_Level_Design.Games.Tik_Tac_Toe;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

//import java.util.*;
///* BlockingQueue → oru special queue (line la items store panni, multi-thread safe).
//
//TimeUnit → time convert panna (seconds → millis, minutes → hours, etc).
//
//LinkedBlockingQueue → BlockingQueue-oda actual implementation (linked list base).
//
//👉 Simple-aa:
//
//BlockingQueue = Rule (interface)
//
//LinkedBlockingQueue = Real queue (class)
//
//TimeUnit = Time helper Timer ku mostly TimeUnit tha use aagum.
//*/

public class TicTacToe_WithTimer{
    private  static final char [][]board=new char[3][3];
    private static final BlockingQueue<String>BQ=new LinkedBlockingQueue<>();
    private static final int time=30;
    private static final  Scanner in=new Scanner(System.in);

    public static void main(String[] args) {
        Thread th=new Thread(()->{
            while(true) {
                String line = in.nextLine();
                BQ.offer(line);
            }
        },"InputReader");
        th.setDaemon(true);
        th.start();

        iniializeBoard();

        char player='X';
        boolean gameOver=false;

        while(!gameOver){
            printBoard();

            System.out.println("Player "+player+" Turn. Enter move ! "+" You have a Time Limit "+time+" seconds");
            BQ.clear();

            boolean move=Function_Time(player,time);
            if(!move){
                System.out.println("Time up ");
            }else {
                if(haveWon(player)){
                    System.out.println("Win "+player);
                    printBoard();
                    break;
                }
                if(isBoardFul()){
                    printBoard();
                    System.out.println("Drwa");
                    break;
                }
            }
            player= (player=='X') ?'0' :'X';

        }


    }



    public static void iniializeBoard(){
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                board[i][j]='-';
            }
        }
    }

    private static void printBoard() {
        System.out.println();
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(board[r][c]);
                if (c < 2) System.out.print(" | ");
            }
            System.out.println();
            if (r < 2) System.out.println("--+---+--");
        }
        System.out.println();
    }

    public static boolean Function_Time(char player, int time){

        long deadline= (System.nanoTime() + TimeUnit.SECONDS.toNanos(time));

        while(true){
            long remainingTime=(deadline-System.nanoTime());
            if(remainingTime<=0) return false;

            String line;

            try
            {
                line=BQ.poll(remainingTime,TimeUnit.NANOSECONDS);
            }catch (InterruptedException ie ){
                return  false;
            }

            if(line==null){
                System.out.println("Try again ");
                return false;
            }

            line=line.trim();
            if(line.isEmpty()){
                System.out.println("Empty op again ");
                continue;
            }

            String part[]=line.split("\\s+");
            if(part.length!=2){
                System.out.println("Rendu thodra");
                continue;
            }
            int r,c;

            try{
                r=Integer.parseInt(part[0]);
                c=Integer.parseInt(part[1]);
            }catch (NumberFormatException n){
                System.out.println("again");
                continue;
            }

            if(r<0 || r>2 ||c<0 ||c>2){
                System.out.println("NO bro ");
                continue;


            }
            if (board[r][c] != '-') {
                System.out.println("Full");

            }

            board[r][c]=player;

            return  true;




        }


    }
    public static boolean haveWon(char p){
        if(board[0][0]== p && board[1][1]==p && board[2][2] ==p) return true;
        if(board[0][2]==p && board[1][1]==p && board[2][0]==p) return true;

        for(int i=0;i<3;i++){
            if(board[0][i]==p && board[1][i]==p && board[2][i]==p){
                return true;
            }
            if(board[i][0]==p && board[i][1] ==p && board[i][2]==p){
                return true;
            }
        }
        return false;
    }

    public static boolean isBoardFul(){
        int n=board.length;
        int m=board[0].length;

        for (char[] chars : board) {
            for (int j = 0; j < m; j++) {
                if (chars[j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }






}
//
//public class TicTacToe {
//    private static final int timer=15;
//    private static final char [][] board=new char[3][3];
//    private static final Scanner in=new Scanner(System.in);
//    private static final BlockingQueue<String>blockQueue=new LinkedBlockingQueue<>();
//
//    public static void main(String[] args) {
//        Thread th=new Thread(()->{
//            while(true){
//                String line=in.nextLine();
//                blockQueue.offer(line);
//            }
//        },"InputReader");
//        th.setDaemon(true);
//        th.start();
//
//        initBoard();
//
//        char player='X';
//        boolean gameover=false;
//
//        while(!gameover){
//            printboard();
//            System.out.println("Player "+player+" turn. Enter move as (0,2) you have "+timer+" seconds");
//            blockQueue.clear();
//            boolean move=moveWithTimer(player,timer);
//            if(!move){
//                System.out.println("skip player "+player);
//            }else {
//                if(havewon(player)){
//                    printboard();
//                    System.out.println("Player won"+player);
//
//                }
//            }
//
//
//
//
//        }
//
//    }
//
//    public static void initBoard(){
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                board[i][j]='-';
//            }
//        }
//    }
//
//    public static void printboard(){
//        System.out.println();
//        for(int i=0;i<3;i++){
//            System.out.print("  ");
//            for(int j=0;j<3;j++){
//                System.out.print(board[i][j]);
//                if(j<2) System.out.print(" | ");
//            }
//            System.out.println();
//            if(i<2) System.out.print("  --+---+--");
//
//        }
//        System.out.println();
//    }
//
//    public static boolean moveWithTimer(char player, int second){
//        long deadline=System.nanoTime()+TimeUnit.SECONDS.toNanos(second);
//        while(true){
//            long remainingTime=deadline-System.nanoTime();
//            if(remainingTime<=0){
//                return  false;
//            }
//            String line;
//            try{
//                line=blockQueue.poll(remainingTime,TimeUnit.NANOSECONDS);
//
//            } catch(InterruptedException ie){
//                return false;
//            }
//
//            if(line==null)
//            {
//                return false;
//            }
//            line=line.trim();
//            if(line.isEmpty()){
//                System.out.println("Empty so fast enter fast");
//                continue;
//            }
//            String part[]=line.split("\\s+");
//            if(part.length!=2){
//                System.out.println("row and col try again quick");
//                continue;
//            }
//            int r, c;
//            try {
//                r=Integer.parseInt(part[0]);
//                c=Integer.parseInt(part[1]);
//
//            }catch(NumberFormatException ie){
//                System.out.println("0 1 2 try again ");
//                continue;
//            }
//
//            if(r<0 || r>2 || c<0 || c>2){
//                System.out.println("Row col 0..2 try again");
//                continue;
//            }
//
//            if(board[r][c]!='-'){
//                System.out.println("cell already full ");
//                continue;
//
//            }
//            board[r][c]=player;
//            return  true;
//        }
//    }
//
//
//    public  void def(){
//        System.out.println(" Ok da \uD83D\uDC47 BlockingQueue-nu sollumbothu\n" +
//                "\n" +
//                "Normal queue madhiri items add/remove panna use aagum.\n" +
//                "\n" +
//                "But speciality: adhu threads safe-aa irukum (multi-thread use panna).\n" +
//                "\n" +
//                "Blocking means →\n" +
//                "\n" +
//                "Queue empty irundha, item edutha thread wait/stop (block) aagum until new item varum.\n" +
//                "\n" +
//                "Queue full irundha, item podra thread wait/stop (block) aagum until place free aagum.\n" +
//                "\n" +
//                "\uD83D\uDC49 Example:\n" +
//                "\n" +
//                "One shop counter la queue nu imagine panniko.\n" +
//                "\n" +
//                "Counter empty irundha, customer wait pannuvan (blocking).\n" +
//                "\n" +
//                "Queue full ah irundha, new customer inside varathukku wait panna vendiyathu (blocking).\n" +
//                "\n" +
//                "So, BlockingQueue use panna multi-thread program la \"safe queue + auto waiting system\" free-ah kidaikum.\n" +
//                "\n" +
//                "Nee venuma da, naan oru small code demo koduthuren BlockingQueue eppadi block pannuthu nu?");
//    }
//}
//
//
