package Zoho.GitHub_pradeep;

public class No_78_MazePath {
    static int N;
    public static void main(String[] args) {
        int[][] maze = {
                {1, 1, 0, 0},
                {1, 0, 0, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 1}
        };
        N = maze.length;
        int[][] sol = new int[N][N];

        if (solveMaze(maze, 0, 0, sol)) {
            printSolution(sol);
        } else {
            System.out.println("No path found");
        }
    }

    static boolean solveMaze(int[][] maze, int x, int y, int[][] sol) {
        if (x == N - 1 && y == N - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        if (isSafe(maze, x, y)) {
            sol[x][y] = 1;

            // move right
            if (solveMaze(maze, x, y + 1, sol)) return true;
            // move down
            if (solveMaze(maze, x + 1, y, sol)) return true;

            sol[x][y] = 0; // backtrack
        }
        return false;
    }

    static boolean isSafe(int[][] maze, int x, int y) {
        return x >= 0 && y >= 0 && x < N && y < N && maze[x][y] == 1;
    }

    static void printSolution(int[][] sol) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (sol[i][j] == 1)
                    System.out.print("_ ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
