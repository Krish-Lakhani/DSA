package Array;

public class leetcode1909
{
    public static void main(String[] args) {
        int[] nums = {2,3,1,2};
        int count =0;
        int max =0;
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i] >= nums[i+1] )
            {
                count++;
                if(count > 1)
                {
                    System.out.println(false);
                }
                if(i>0 && nums[i-1]>=nums[i+1])
                {
                    nums[i+1]=nums[i];
                }
            }
        }
        System.out.println(true);
    }
}
