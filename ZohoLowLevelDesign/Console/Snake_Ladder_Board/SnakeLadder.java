package ZohoLowLevelDesign.Console.Snake_Ladder_Board;
import java.util.*;
public class SnakeLadder {
    static final int point = 100;
    static SnakeBoard PlayBoard = new SnakeBoard();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PlayBoard.setupBoard();

        int p1 = 0, p2 = 0;

        int currentPlayer = 1;

        System.out.println("🎲 Welcome to Snake and Ladder Game!");

        while (p1 < point && p2 < point) {
            System.out.println();
            System.out.println("Player " + currentPlayer + " - Press Enter to roll...");
            in.nextLine();

            int dice = roll();
            System.out.println("🎲 Rolled: " + dice);

            if (currentPlayer == 1) {
                p1 = move(p1, dice);
                System.out.println("Player 1 is at position: " + p1);
                if (p1 == point) {
                    System.out.println("🎉 Player 1 wins!");
                    break;
                }
            } else {
                p2 = move(p2, dice);
                System.out.println("Player 2 is at position: " + p2);
                if (p2 == point) {
                    System.out.println("🎉 Player 2 wins!");
                    break;
                }
            }
            if (dice != 6) {
                // 🔄 This is now very easy to understand
                if (currentPlayer == 1) {
                    currentPlayer = 2;
                } else {
                    currentPlayer = 1;
                }
            } else {
                System.out.println("Rolled 6! 🌀 Play again!");
            }
        }
        in.close();
    }

    public static int roll() {
        return new Random().nextInt(6) + 1;
    }

    static int move(int pos, int dice) {
        if (pos + dice > point) return pos;
        pos += dice;
        if(PlayBoard.snakes.containsKey(pos))
        {
            System.out.println("snake kadichiruchu keela po "+PlayBoard.snakes.get(pos));
            pos=PlayBoard.snakes.get(pos);
        }else if(PlayBoard.ladders.containsKey(pos))
        {
            System.out.println("Ladder eru eru valimai kondu eru "+PlayBoard.ladders.get(pos));
            pos=PlayBoard.ladders.get(pos);
        }
        if (PlayBoard.snakes.containsKey(pos)) {
            System.out.println("🐍 Snake bite! Go down to " + PlayBoard.snakes.get(pos));
            pos = PlayBoard.snakes.get(pos);
        } else if (PlayBoard.ladders.containsKey(pos)) {
            System.out.println("🪜 Ladder! Climb up to " + PlayBoard.ladders.get(pos));
            pos = PlayBoard.ladders.get(pos);
        }
        return pos;
    }
}
