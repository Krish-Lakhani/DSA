package Matrix;

public class Zigzag
{
        public static void main(String[] args) {
            int[][] matrix = {  {2,4,6,} ,
                                {7,8,9,} ,
                                {1,9,5,} };

            for (int i = 0; i < matrix.length; i++)
            {
               if(i%2==0)
               {
                   for (int j = 0; j < matrix[0].length; j++)
                   {
                       System.out.print(matrix[i][j]);
                   }
               }

               else
               {
                   for (int j = matrix[0].length-1; j>=0 ; j--)
                   {
                       System.out.print(matrix[i][j]);
                   }
               }

                System.out.println();
            }
        }
}
