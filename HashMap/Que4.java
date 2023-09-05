package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Que4
{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,5,5,2,2,4,3,3,3};

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            hm.put(array[i], hm.getOrDefault(array[i], 0) + 1);
        }

        int max =0;
        int ans = 0;
        for (Map.Entry<Integer,Integer> me : hm.entrySet())
        {
            if(max < me.getValue())
            {
                ans = me.getKey();
                max = me.getValue();
            }
        }
        System.out.println(ans + "->" + max);
    }
}
