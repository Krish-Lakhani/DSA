package Binary_search;
import java.util.*;

public class leetcode1608
{
    public static void main(String[] args) {
        int[] nums = {3,5};
      //  Arrays.sort(nums);

       int start = 0;
       int end = nums.length;

       while (start <= end)
       {
           int mid = (start + end) / 2;
           int count = 0 ;

           for (int i = 0; i < nums.length; i++)
           {
                if(nums[i] >= mid) count++;
           }

           if(count == mid) System.out.print(mid);

           else if (count > mid) start = mid + 1;

           else end = mid - 1;
       }
        System.out.println(-1);
    }
}
