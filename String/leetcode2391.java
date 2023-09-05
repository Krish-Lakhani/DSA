package String;

import java.util.Arrays;

public class leetcode2391
{
    public static void main(String[] args) {
        String[] garbage = {"G","P","GP","GG"};
        int[]  travel = {2,4,3};
        int sum =0;
        int glass =0;
        int paper =0;
        int metal =0;
        int[] prifixsum = new int[garbage.length];

        prifixsum[0] = 0;
        for (int i = 1; i < garbage.length; i++)
        {
            prifixsum[i] = prifixsum[i-1] + travel[i-1];
        }

        for (String i : garbage)
        {
            sum += i.length();
        }

        for (int i = garbage.length-1; i >=0 ; i--)
        {
            if(garbage[i].indexOf('G') != -1 )
            {
                glass = i;
                break;
            }
        }

        for (int i = garbage.length-1; i >=0 ; i--)
        {
            if(garbage[i].indexOf('P') != -1)
            {
                paper = i;
                break;
            }
        }

        for (int i = garbage.length-1; i >=0 ; i--)
        {
            if(garbage[i].indexOf('M') != -1)
            {
                metal = i;
                break;
            }
        }
        System.out.println(Arrays.toString(prifixsum));
        System.out.println(glass);
        System.out.println(paper);
        System.out.println(metal);


        System.out.println(prifixsum[glass] + prifixsum[metal] + prifixsum[paper] + sum);
    }
}
