package Problem_Solving.Recursion_problems;

public class Sudoku_solver {
    static boolean [][]row=new boolean[9][10];
    static boolean [][]col=new boolean[9][10];
    static boolean [][]grid=new boolean[9][10];

    public static void main(String[] args) {
        char[][] board = {
                {'9','5','7','.','1','3','.','8','4'},
                {'4','8','3','.','5','7','1','.','6'},
                {'.','1','2','.','4','9','5','3','7'},
                {'1','7','.','3','.','4','9','.','2'},
                {'5','.','4','9','7','.','3','6','.'},
                {'3','.','9','5','.','8','7','.','1'},
                {'8','4','5','7','9','.','6','1','3'},
                {'.','9','1','.','3','6','.','7','5'},
                {'7','.','6','1','8','5','4','.','9'}
        };
        SolveSudoko(board);

        for(char [] a:board){
            for(char c:a){
                System.out.print(c+" ");
            }
            System.out.println();

        }

    }
    public static boolean SolveSudoko(char [][] board)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.'){
                    int d=board[i][j]-'0';
                    row[i][d]=col[j][d]=grid[(i/3)*3+j/3][d]=true;
                }
            }
        }

        return BackTrack(board,0,0);

    }

    public static boolean BackTrack(char [][]board,int r, int c)
    {
        if(r==9) return true;
        if(c==9) return  BackTrack(board,r+1,0);
        if(board[r][c]!='.') return BackTrack(board,r,c+1);

        int g=((r/3)*3 + c/3);

        for(int i=1;i<=9;i++)
        {
            if(!row[r][i] && !col[c][i] && !grid[g][i]){
                board[r][c]=(char)(i+'0');
                row[r][i]= col[c][i] = grid[g][i]=true;

                if(BackTrack(board,r,c+1)) return true;

                board[r][c]='.';
                row[r][i]= col[c][i] = grid[g][i]=false;
            }
        }
        return false;
    }
}
/*
Ah! quick rapid-fire answer for that 😎

Q: Why boolean[9][10] instead of [9][9]?

A:

row[i][d] stores whether digit d (1–9) is used in row i.

Index 0 is unused, so we can directly access row[i][1..9] without -1.

Makes code cleaner: row[i][d] = true instead of row[i][d-1] = true.

✅ [9][10] → 9 rows, digits 1–9 indexed directly.

If you want, I can give same rapid-fire explanation for col and grid too. Do you want me to?

You said:
why this value
[(i/3)*3+j/3]
ChatGPT said:

Rapid-fire answer 😎

Q: Why grid[(i/3)*3 + j/3]?

A:

Sudoku has 9 boxes (3×3).

(i/3) → box row (0,1,2), (j/3) → box column (0,1,2)

(i/3)*3 + j/3 → maps 2D box coords to 0–8 index

Example:

Top-left box → (0/3)*3 + 0/3 = 0

Middle box → (4/3)*3 + 5/3 = 3 + 1 = 4

✅ This lets you track digits used in each 3×3 grid.
 */