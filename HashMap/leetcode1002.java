package HashMap;
import java.util.*;

public class leetcode1002 {
    public static void main(String[] args) {
        String[]  words = {"bella","label","roller"};
        List<String> list = new ArrayList<>();
        HashMap<Character, Integer> hm = new HashMap<>();

        String str = words[0];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            hm.put(ch,hm.getOrDefault(ch, 0) + 1);
        }

        System.out.println(hm);

        for(int i=1; i<words.length; i++){
            String s = words[i];
            HashMap<Character, Integer> nhm = new HashMap<>();

            for(int j=0; j<s.length(); j++){
                char ch = s.charAt(j);
                nhm.put(ch,nhm.getOrDefault(ch, 0) + 1);
            }

            for(char c : hm.keySet()){
                if(nhm.containsKey(c)){
                    if(nhm.get(c)>0){
                        hm.put(c, Math.min(hm.get(c), nhm.get(c)));
                    }
                }
                else{
                    hm.put(c, 0);
                }
            }
            System.out.println(nhm);
        }
        System.out.println(hm);


        for(char c : hm.keySet()){
            int a = hm.get(c);
            while(a-- > 0){
                list.add(""+c);
            }
        }

        System.out.println(list);
    }
}
