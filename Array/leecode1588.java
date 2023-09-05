package Array;

import java.util.HashMap;

public class leecode1588
{
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        int sum=0;
        int n = arr.length;
        for(int i=0; i<arr.length; i++)
        {
            int left = i+1; // elements on left side of index i
            int right = n-i; // elements on right side of index i
            int k = left * right; // total subarrays
            int odd = (k+1)/2; // number of odd length subarrays

            sum = sum + odd*arr[i]; // odd*arr[i] -> sum of a particular elements present in all odd length subarrays.
        }

        System.out.println(sum);
    }
}
