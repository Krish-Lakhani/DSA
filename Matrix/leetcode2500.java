package Matrix;

import java.util.Arrays;

public class leetcode2500
{
    public static void main(String[] args) {
        int[][] grid = {{1,2,4},{3,3,1}};

        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }

        int sum =0;
        for (int i = 0; i < grid[0].length; i++)
        {
            int max = 0;
            for (int j = 0; j < grid.length; j++) {
                if(max < grid[j][i]){
                    max = grid[j][i];
                }
            }
            sum += max;
        }
        System.out.println(sum);
    }
}
