package HashMap;

import java.util.*;

public class leetcode1282
{
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,3,1,3};

        HashMap<Integer,List<Integer>> hm = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.get(arr[i]).add(i);
            }
            else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                hm.put(arr[i], list);
            }

            if(hm.get(arr[i]).size() == arr[i])
            {
                ans.add(hm.get(arr[i]));
                hm.remove(arr[i]);
            }
        }
        System.out.println(ans);
    }
}
