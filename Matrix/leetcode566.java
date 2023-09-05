package Matrix;

import java.util.Arrays;

public class leetcode566
{
    public static void main(String[] args) {

        int[][] mat = { {1,2},
                        {3,4} };
        int r = 1 ,c =4;
        int[][] ans = new int[r][c];
        int row = 0 ,col =0;

        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[0].length; j++)
            {
                    ans[row][col] = mat[i][j];
                    col++;
                    if(col == c)
                    {
                        row++;
                        col =0;
                    }
            }
        }



//        int n = nums.length, m = nums[0].length;
//        if (r * c != n * m) return nums;
//        int[][] ans = new int[r][c];
//        for (int i = 0; i < r * c; i++)
//            ans[i / c][i % c] = nums[i / m][i % m];

        System.out.println(Arrays.deepToString(ans));
    }
}
