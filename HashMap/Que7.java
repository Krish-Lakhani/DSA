package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Que7 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,5,5,6};
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer,Integer> me : hm.entrySet())
        {
            if(me.getValue() == 1)
            {
                System.out.println(me.getKey());
            }
        }
    }
}
