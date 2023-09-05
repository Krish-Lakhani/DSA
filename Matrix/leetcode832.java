package Matrix;

import java.util.Arrays;

public class leetcode832
{
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};


        for (int i =0; i < image.length ; i++)
        {
            int left = 0;
            int right = image[i].length-1;
            while (left < right)
            {
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;
                left++;
                right--;
            }
            for (int j = 0; j < image[0].length; j++)
            {
                if(image[i][j] == 0) image[i][j] = 1;
                else image[i][j] = 0;
            }
        }


        System.out.println();
        System.out.println(Arrays.deepToString(image));
    }
}
