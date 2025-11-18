package set12;
/*
 * Case 1: Both matrices are already equal

Input:

A = [[1,2],
     [3,4]]

B = [[1,2],
     [3,4]]


matricesEqual(A,B) → true

No need to check flips

Output: true ✅

Case 2: Only horizontal flip works

Input:

A = [[1,2],
     [3,4]]

B = [[3,4],
     [1,2]]


Horizontal flip of A → [[3,4],[1,2]] ✅ matches B

Output: true ✅

Case 3: Only vertical flip works

Input:

A = [[1,2],
     [3,4]]

B = [[2,1],
     [4,3]]


Vertical flip of A → [[2,1],[4,3]] ✅ matches B

Output: true ✅

Case 4: Both flips required

Input:

A = [[1,2],
     [3,4]]

B = [[4,3],
     [2,1]]


Horizontal flip → [[3,4],[1,2]] ❌

Vertical flip → [[2,1],[4,3]] ❌

Both flips → [[4,3],[2,1]] ✅ matches B

Output: true ✅

Case 5: No flips work

Input:

A = [[1,2],
     [3,4]]

B = [[1,3],
     [2,4]]


Horizontal flip → [[3,4],[1,2]] ❌

Vertical flip → [[2,1],[4,3]] ❌

Both flips → [[4,3],[2,1]] ❌

A == B → ❌

Output: false ❌
 */
public class matrix_verify {
    public static void main(String[] args) {
        int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int b[][]={
            {7,8,9},
            {1,2,3},
            {4,5,6}
        };
        boolean transform=function(a,b);
        System.out.println(transform);
    }

    public static boolean function(int [][]a, int [][]b){
        return arrayBothEqual(a,b) ||
        arrayBothEqual(horizontalCheck(a),b) ||
        arrayBothEqual(verticalCheck(a), b)||
        arrayBothEqual(verticalCheck(horizontalCheck(a)),b);


    }

    public static boolean arrayBothEqual(int [][]a,int [][]b){
            int n=a.length;
            int m=a[0].length;

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(a[i][j]!=b[i][j]) return false;
                }
            }
            return true;
    }

    public static int[][] horizontalCheck(int [][]a){
        int n=a.length;
        int m=a[0].length;
        int res[][]=new int[m][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j]=a[m-1-i][j];
            }   
        }

        return res;

    }

    public static int[][] verticalCheck(int [][]a){
        int n=a.length;
        int m=a[0].length;
        int res[][]=new int[m][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j]=a[i][n-1-j];
            }   
        }

        return res;

    }
}
