package HashMap;
import java.util.*;
public class leetcode2506 {
    public static void main(String[] args) {
        String[] words = {"aba","aabb","abcd","bac","aabc"};
        HashMap<Set<Character>, Integer> hm = new HashMap<>();
        for(String s: words){
            Set<Character> set = new HashSet<>();
            for(char ch: s.toCharArray()){
                set.add(ch);
            }
            hm.put(set, hm.getOrDefault(set,0)+1);
        }

        int ans =0;
        for(int i: hm.values()){
            ans += i*(i-1)/2;
        }
        System.out.println(ans);
    }
}

