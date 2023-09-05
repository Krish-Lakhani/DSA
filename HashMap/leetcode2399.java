package HashMap;
import java.util.*;
public class leetcode2399 {
    public static void main(String[] args) {
        String s = "aa";
        int[] distance = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        Set<Character> set  = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                int idx = 1+i + distance[ch-'a'];
                if(idx >= s.length()){
                    System.out.println(false);
                    return;
                }
                if(s.charAt(idx) != ch){
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }
}
