package Pdf110;
/*
Pascal triangle example:

        1
      1   1
    1   2   1
  1   3   3   1
1   4   6   4   1


Question la sollrathu:

“In a given Pascal triangle, find the possible triangles.”

Idhu geometric triangles illa, small number-triangles inside the Pascal triangle dhaan.

Example:

   1
  1 1


or

   1
  2 1
 3 3 1


Ithu ellam “possible triangles” nu count panrom.

Any small triangle inside Pascal triangle counts.

🔹 Formula

Pascal triangle la n rows irundha:

Row 2 → 1 triangle

Row 3 → 4 triangles

Row 4 → 9 triangles … etc

🔹 Example

n = 5 rows:

1^2 + 2^2 + 3^2 + 4^2 = 1 + 4 + 9 + 16 = 30
 */
public class No_64_smallestPossibleTriangle {
    public static void main(String[] args) {
        int n=5;
        int totalTriangles = (n*(n-1)*(2*n-1))/6;
        System.out.println(totalTriangles);
    }
}
