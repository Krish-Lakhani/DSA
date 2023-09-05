package Sorting;

import java.util.Arrays;

public class Insertion_sort
{
    public static void main(String[] args) {
        int[] arr = {7,8,2,4,5};

        for (int i = 1; i < arr.length; i++)
        {
            int currant = arr[i];
            int j = i-1;
            while (j >=0 && currant < arr[j])
            {
                arr[j+1]  = arr[j];
                j--;
            }
            arr[j+1] = currant;
        }
        System.out.println(Arrays.toString(arr));
    }
}
