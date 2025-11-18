package ZohoLowLevelDesign.Console.Snake_Ladder_Board;
import java.util.*;

public class SnakeBoard {
    public Map<Integer, Integer> snakes = new HashMap<>();
    public Map<Integer, Integer> ladders = new HashMap<>();

    public void setupBoard() {
        // Snakes
        snakes.put(99, 54);
        snakes.put(70, 55);
        snakes.put(52, 42);
        snakes.put(25, 2);
        snakes.put(95, 72);

        // Ladders
        ladders.put(6, 25);
        ladders.put(11, 40);
        ladders.put(60, 85);
        ladders.put(46, 90);
        ladders.put(17, 69);
    }
}
