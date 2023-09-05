package Matrix;

public class Reverce
{
    public static void main(String[] args) {
        int[][] matrix = { {2,4,6,} ,{7,8,9,} , {1,9,5}};

        for (int i =matrix.length-1; i>=0 ;i--)
        {
            for (int j = matrix[0].length-1; j>=0 ; j--)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
