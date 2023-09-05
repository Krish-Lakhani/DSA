package Matrix;
import java.util.*;

public class leetcode1380
{
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        int[] rowArray = new int[matrix.length];
        int[] colArray = new int[matrix[0].length];
        int idx =0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<matrix.length; i++)
        {
            int min = Integer.MAX_VALUE;
            for(int j=0; j<matrix[0].length; j++)
            {
                min = Math.min(min,matrix[i][j]);
            }
            rowArray[idx++] = min;
        }
            idx = 0;
        for(int i=0; i<matrix[0].length; i++)
        {
            int max = Integer.MIN_VALUE;
            for(int j=0; j<matrix.length; j++)
            {
                max = Math.max(max,matrix[j][i]);
            }
            colArray[idx++] = max;
        }

        for(int i=0; i<matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (rowArray[i] == matrix[i][j] && colArray[j]==matrix[i][j]) {
                    list.add(matrix[i][j]);
                }
            }
        }

        System.out.println(list);
    }

    public static class leetcode1260
    {
        public static void main(String[] args) {
            int[][] grid = {{3,8,1,9},
                            {19,7,2,5},
                            {4,6,11,10},
                             {12,0,21,13}};
            int m = grid.length;
            int n = grid[0].length;
            int[][] ans = new int[m][n];
            int k=4;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    int row = (i + (j+k)/n) % m;
                    int col = (j + k) % n;

                    ans[row][col] = grid[i][j];
                }
            }

           // return (List)Arrays.asList(ans);
            // return(List)Arrays.asList(ans);
        }
    }
}
