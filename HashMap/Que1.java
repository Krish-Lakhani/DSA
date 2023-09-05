package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Que1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] array2 = {2,4};

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            hs.add(array[i]);
        }

        for (int i = 0; i < array2.length; i++) {
            if(!hs.contains(array2[i])){
                System.out.println("not subset");
                return;
            }
        }
        System.out.println("subset");
    }
}
