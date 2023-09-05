package HashMap;
import java.util.*;
public class leetcode2815 {
    public static void main(String[] args) {
        int[] nums = {68,8,100,84,80,14,88};
        int max = -1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            int maxdigit = maxd(i);
            if(map.containsKey(maxdigit)){
                max = Math.max(max,map.get(maxdigit)+i);
                map.put(maxdigit,Math.max(map.get(maxdigit),i));
            }
            else map.put(maxdigit,i);

        }
        System.out.println(max);
    }
    public static int maxd(int a){
        int max = 0;
        while(a > 0){
            max = Math.max(a%10,max);
            a/= 10;
        }
        return max;
    }
}
