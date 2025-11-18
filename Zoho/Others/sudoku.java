package Zoho.Others;

public class sudoku {
    public static void main(String[] args) {
        int [][]arr={
                {1,2,3,4,5,6,7,8,9},
                {4,5,6,7,8,9,1,2,3},
                {7,8,9,1,2,3,4,5,6},
                {2,3,4,5,6,7,8,9,1},
                {5,6,7,8,9,1,2,3,4},
                {8,9,1,2,3,4,5,6,7},
                {3,4,5,6,7,8,9,1,2},
                {6,7,8,9,1,2,3,4,5},
                {9,1,2,3,4,5,6,99,8}
        };

        if(cheaksudoku(arr))
        {
            System.out.println("Valid da ");
        }else {
            System.out.println("Invalid thambi");
        }
    }

    public static boolean cheaksudoku(int arr[][])
    {
        // 3 velai
        //  row full duplicate aa check
        // column full aa check;
        //  3*3 full check;


        for(int i=0;i<9;i++)
        {
            boolean []row=new boolean[9];
            boolean[] col=new boolean[9];

            for(int j=0;j<9;j++) {
                if (!checkNumber(arr[i][j], row))
                    return false;

                if (!checkNumber(arr[j][i], col)) {
                    return false;
                }
            }
        }
        // // 3*3 Grid

        for(int i=0;i<9;i=i+3)
        {
            for(int j=0;j<9;j+=3)
            {
                    boolean block[]=new boolean[9];

                    for(int row=i;row<i+3;row++)
                    {
                        for(int col=j;col<j+3;col++)
                        {
                            if(!checkNumber(arr[row][col],block))
                            {
                                return false;
                            }
                        }
                    }
            }
        }

        return true;



    }

    public static boolean checkNumber(int number,boolean[] row)
    {
        if(number<0 || number>9)
        {
            System.out.println("Invalid number");
            return false;
        }
        if(row[number-1])
        {
            System.out.println("Duplicate ");
            return false;
        }
        row[number-1]=true;

        return  true;
    }
}
/*
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

public class Main
{
    public static void main(String[] args) {
        int arr[][]={
                {1,2,3,4,5,6,7,8,9},
                {4,5,6,7,8,9,1,2,3},
                {7,8,9,1,2,3,4,5,6},
                {2,3,4,5,6,7,8,9,1},
                {5,6,7,8,9,1,2,3,4},
                {8,9,1,2,3,4,5,6,7},
                {3,4,5,6,7,8,9,1,2},
                {6,7,8,9,1,2,3,4,5},
                {9,1,2,3,4,5,6,7,8}
        };

        if(cheak(arr))
        {
            System.out.println("Valid ");
        }


    }

    public static boolean cheak(int arr[][])
    {
        for(int i=0;i<9;i++)
        {
            boolean row[]=new boolean[9];
            boolean col[]=new boolean[9];

            for(int j=0;j<9;j++)
            {
                if(!cheakNumber(arr[i][j],row))
                {
                    return false;
                }
                if(!cheakNumber(arr[j][i],col))
                {
                    return false;
                }
            }
        }

        for(int i=0;i<9;i+=3)
        {
            for(int j=0;j<9;j+=3)
            {
                boolean grid[]=new boolean[9];

                for(int row=i;row<i+3;row++)
                {
                    for(int col=j;col<j+3;col++)
                    {
                        if(!cheakNumber(arr[row][col],grid))
                        {
                            return false;

                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean cheakNumber(int num, boolean cheak[])
    {
        if(num <0 ||num>9)
        {
            System.out.println("Invalid number "+num);
            return false;
        }
        if(cheak[num-1])
        {
            System.out.println("Duplicate "+num);
            return false;
        }
        cheak[num-1]=true;
        return true;
    }
}

 */