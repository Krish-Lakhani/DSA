package Matrix;

import java.util.Arrays;

public class leetcode2614
{
    public static void main(String[] args) {

        int[][] nums = {{1,2,3},{5,6,7},{9,10,11}};
        int[] ans = new int[nums.length*2];
        int[] ans1 = new int[nums.length*2];

        int k =0;

        for (int i = 0; i < nums.length; i++)
        {
            ans[k++]= nums[i][i];
            if(i != nums.length-i-1)
                ans[k++] = nums[i][nums.length-i-1];
        }

        for (int i = 0; i < ans.length; i++)
        {
            for (int j = 2; j < Math.sqrt(ans[i]); j++)
            {
                if(ans[i] % j != 0) ans1[i] = ans[i];
               // break;
            }
        }

        Arrays.sort(ans1);
      //  System.out.println(Arrays.toString(ans1));

        System.out.println(ans1[ans1.length-1]);

//        int ans =0;
//
//        for (int i = 0; i < nums.length; i++)
//        {
//            for (int j = 0; j < nums[i].length; j++)
//            {
//                if(i==j || j == nums.length- i -1 && (isprime(nums[i][j])))
//                {
//                    ans = Math.max(ans,nums[i][j]);
//                }
//            }
//        }
//        return ans;
//    }
//
//    private static boolean isprime(int n)
//    {
//        if (n < 2) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//
//        return true;
    }


}
