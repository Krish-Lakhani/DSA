package Binary_search;

import java.util.Arrays;

public class leetcode1385 {
    public static void main(String[] args) {
        int[] arr1 = {1,4,2,3};
        int[] arr2 = {-4,-3,6,10,20,30};
        int d = 3 , count = 0;

        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if( Math.abs(arr1[i] - arr2[j]) <= d)
                {
                    count = i;
                }
                break;
            }
        }
        System.out.println(count);
    }
}
