package Matrix;

public class sum
{
    public static void main(String[] args) {
        int[][] matrix = { {2,4,6,} ,{7,8,9,} , {1,9,5}};

        int sum =0;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
