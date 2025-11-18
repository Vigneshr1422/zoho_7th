package ZohoLowLevelDesign.Console.Dungeon_Game;

import java.util.*;

public class DungeonGame {
    public static void main(String[] args) {
                Scanner in=new Scanner(System.in);
                System.out.println("Enter Grid Size (row and column) ");
                int row=in.nextInt();
                in.nextLine();
                int col=in.nextInt();
                char [][] dungeon=new char[row][col];

                for(int i=0;i<dungeon.length;i++)
                {
                    for(int j=0;j<dungeon[i].length;j++)
                    {
                        dungeon[i][j]='.';
                    }
                }

                int[] pos;
        // Adventurer
                pos = getValidPosition(in, row, col, "Adventurer");
                int arow = pos[0], acol = pos[1];
                dungeon[arow][acol] = 'A';

        // Monster
                pos = getValidPosition(in, row, col, "Monster");
                int mrow = pos[0], mcol = pos[1];
                dungeon[mrow][mcol] = 'M';

        // Trigger
                pos = getValidPosition(in, row, col, "Trigger");
                int Trow = pos[0], Tcol = pos[1];
                dungeon[Trow][Tcol] = 'T';

        // Treasure
                pos = getValidPosition(in, row, col, "Treasure");
                int Trrow = pos[0], Trcol = pos[1];
                dungeon[Trrow][Trcol] = 'X';

        // Pits
                System.out.println("Enter number of pits:");
                int pits = in.nextInt();
                for (int i = 0; i < pits; i++) {
                    pos = getValidPosition(in, row, col, "Pit " + (i + 1));
                    dungeon[pos[0]][pos[1]] = 'P';
                }


        System.out.println("\nDungeon Layout:");
        for (char[] r : dungeon) {
            for (char c : r) System.out.print(c + " ");
            System.out.println();
        }


                int adventureTotrigger=Math.abs(arow-Trow) + Math.abs(acol-Tcol);
                int MonsterTotrigger=Math.abs(mrow-Trow)+Math.abs(mcol-Tcol);

                int AdventureToTressure=Math.abs(arow-Trrow)+Math.abs(acol-Trcol);
                int MonsterToTressure=Math.abs(mrow-Trrow)+Math.abs(mcol-Trcol);

                if(adventureTotrigger<MonsterTotrigger)
                {
                    System.out.println("Adventure Reaches the trigger First");
                    System.out.println("Monster Frozen");
                    System.out.println("Adventure can safely reach the treasure ");
                }
                else if(adventureTotrigger>MonsterTotrigger) {
                    System.out.println("Monster Reaches the trigger First ");
                    System.out.println("Trigger is deactivate");

                    if (AdventureToTressure < MonsterToTressure) {
                        System.out.println("Adventure can still reach the tressure before the monster ");
                    } else {
                        System.out.println("Monster will catch the Adventure");
                    }
                }
                in.close();

                }

    public static int[] getValidPosition(Scanner in, int row, int col, String name) {
        while (true) {
            System.out.println("Enter " + name + " position (row and column):");
            int r = in.nextInt();
            int c = in.nextInt();
            if (r >= 0 && r < row && c >= 0 && c < col) {
                return new int[]{r, c};
            }
            System.out.println("❌ Invalid! Row must be 0 to " + (row - 1) + ", Col must be 0 to " + (col - 1));
        }
    }

}
