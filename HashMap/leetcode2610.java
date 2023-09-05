package HashMap;

import java.util.*;

public class leetcode2610
{
    public static void main(String[] args) {
        int[] nums = {1,3,4,1,2,3,1};
        Map<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<nums.length; i++)
        {
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }

        List<List<Integer>> ans = new ArrayList<>();

        while(true)
        {
            List<Integer> list = new ArrayList<>();

            for(int i : hm.keySet())
            {
                if(hm.get(i) > 0)
                {
                    list.add(i);
                    hm.put(i,hm.get(i)-1);
                }
            }

            if(list.size() == 0){
                break;
            }
            ans.add(list);
        }
        System.out.println(ans);
    }
}
