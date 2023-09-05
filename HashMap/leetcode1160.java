package HashMap;
import java.util.*;

public class leetcode1160 {
    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        int ans = 0;
        Map<Character, Integer> hm = new HashMap<>();
        for(char ch : chars.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch,0)+1);
        }

        loop:
        for(String s : words){
            Map<Character, Integer> temp = new HashMap<>();
            for(char ch : s.toCharArray()){
                temp.put(ch, temp.getOrDefault(ch,0)+1);
            }

            for(char ch : temp.keySet()){
                if(hm.containsKey(ch)){
                    if(hm.get(ch) < temp.get(ch))continue loop;
                }else{
                    continue loop;
                }
            }
            ans += s.length();
        }
        System.out.println(ans);
    }
}
