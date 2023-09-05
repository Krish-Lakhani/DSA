package Matrix;

import java.util.*;

import java.util.Arrays;

public class leetcode1886 {
    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0},
                {0, 1, 0},
                {1, 1, 1,}};
        int[][] target = {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};

        for (int i = 0; i < 4; i++)
        {
            if(Arrays.deepEquals(mat,target)) {
                System.out.println(true);
                return;
            }
            mat = roteat(mat);
        }

        System.out.println(false);
    }


    private static int[][] roteat(int[][] mat)
    {
        for (int i = 0; i < mat.length; i++)
        {
            for (int j = i; j < mat[0].length; j++)
            {
                int temp =  mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i]  = temp;
            }
        }

        int left = 0;
        int right = mat[0].length-1;
        int temp =0;
        for (int i = 0; i < mat.length; i++)
        {
            while(left < right)
            {
                temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
        return mat;
    }
}
