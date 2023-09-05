package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Que2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 6;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            hm.put(array[i], hm.getOrDefault(array[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> me : hm.entrySet()) {
            if(me.getKey() * 2 == sum){
                if(me.getValue() >= 2){
                    System.out.println(me.getKey() + "+" + me.getKey() + "=" + sum);
                    return;
                }
            }
            else {
                int temp = sum - me.getKey();
                if (hm.containsKey(temp)) {
                    System.out.println(temp + "+" + me.getKey() + "=" + sum);
                }
            }
        }
    }
}
