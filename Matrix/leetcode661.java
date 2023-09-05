package Matrix;

import java.util.Arrays;

public class leetcode661
{
    public static void main(String[] args) {

        int[][] img = {{100,200,100},{200,50,200},{100,200,100}};
        int num1 = 0, ans1 =0;
        int num2 = 0, ans2 =0;
        int num3 = 0, ans3 =0;
        int[][] img2 = new int[img.length][img.length];



        for (int i = 0; i < img.length-1; i++)
        {
            for (int j = 0; j < img[0].length-1; j++)
            {
                num1 += img[i][j];
                ans1 = num1/4;
            }
        }

        for (int i = 0; i < img.length-1; i++)
        {
            for (int j = 0; j < img[0].length; j++)
            {
                num2 += img[i][j];
                ans2 = num2/6;
            }
        }


        for (int i = 0; i < img.length; i++)
        {
            for (int j = 0; j < img[0].length; j++)
            {
                num3 += img[i][j];
                ans3 = num3/9;
            }
        }

        for (int i = 0; i < img2.length; i++)
        {
            for (int j = 0; j < img2[0].length; j++)
            {
                if( (i==0 && j==0) || (i==0 && j==2) || (i==2 && j==0) || (i==2 & j==2) )
                {
                    img2[i][j] = ans1;  //0,1), (1,0), (1,2), (2,1)
                }
                else if ((i==0 && j==1) || (i==1 && j==0) || (i==1 && j==2) || (i==2 & j==1))
                {
                    img2[i][j] = ans2;
                }
                else
                    img2[i][j] = ans3;
            }
        }

        System.out.println(Arrays.deepToString(img2));
    }
}
