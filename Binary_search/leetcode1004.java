package Binary_search;

public class leetcode1004 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        int left =0;
        int right =0;
        int zero =0;
        while(right < nums.length){
            if(nums[right] == 0){
                zero++;
            }
            right++;
            if(zero > k){
                if(nums[left] == 0){
                    zero--;
                }
                left++;
            }
        }
        System.out.println(right -left);
    }
}
