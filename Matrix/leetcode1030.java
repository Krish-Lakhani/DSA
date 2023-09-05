package Matrix;

import java.util.Arrays;

public class leetcode1030
{
    public static void main(String[] args) {
        int row = 2 ,col = 3;
        int[][] ans = new int[row*col][2];
        int temp = 0;
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                ans[temp][0] = Math.abs(i-1);
                ans[temp][1] = Math.abs(j-2);
                temp++;
            }
        }
        System.out.println(Arrays.deepToString(ans));
    }
}
