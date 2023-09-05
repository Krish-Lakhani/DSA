package HashMap;

import java.util.HashMap;

public class leetcode_2006
{
    public static void main(String[] args) {

                int[] nums = {1,2,2,1};
                int k = 1;

                int counter=0;
                HashMap<Integer,Integer> map= new HashMap<>();

                for (int i = 0; i <nums.length ; i++) {
                    map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                }

                for (int i = 0; i <nums.length ; i++) {
                    if(map.containsKey(nums[i]-k)) {
                        int key = Math.abs(nums[i] - k);
                        counter += map.get(key);
                    }
                }
        System.out.println(counter);
    }
}
