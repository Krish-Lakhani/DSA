package HashMap;

import java.util.HashMap;

public class leetcode2283
{
    public static void main(String[] args) {
        String nums = "1210";
        HashMap<Integer ,Integer> hm = new HashMap<>();

        for(int i=0; i<nums.length(); i++)
        {
            int temp = nums.charAt(i) - '0';
            hm.put(temp , hm.getOrDefault(temp , 0)+ 1);
        }

        for(int i=0; i<nums.length(); i++)
        {
            int temp = nums.charAt(i) - '0';
            int count =0;
            if(hm.containsKey(i))
            {
                count = hm.get(i);
            }

            if(count != temp)
            {
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}
