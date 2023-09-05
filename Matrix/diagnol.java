package Matrix;

public class diagnol
{
    public static void main(String[] args) {
        int[][] matrix = {  {2,4,6,} ,
                            {7,8,9,} ,
                            {1,9,5,} };

        for (int i = 0; i < matrix.length; i++)
        {
               // if(i == j) System.out.print(matrix[i][j]);
               // System.out.print(matrix[i][i]);
            System.out.print(matrix[i][matrix.length-i-1]);
        }
    }
}
