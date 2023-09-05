package Array;

import java.util.Arrays;

public class TwoSum
{
    public static void main(String[] args) {
        int[] nums = {3,2,4,8,5,0};
        int target = 9;
        int[] res = new int[2];

        for (int i = 1; i < nums.length; i++) {

            for (int j = 0; j+i<nums.length; j++) {

                if(nums[j]+nums[j+i]==target) {
                    res[0]=j;
                    res[1]=j+i;
                    System.out.println(Arrays.toString(res));
                }
            }
        }
    }
}
