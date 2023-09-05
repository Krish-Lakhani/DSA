package HashMap;

import java.util.*;

public class leetcode1496 {
    public static void main(String[] args) {
        String path = "NNSWWEWSSESSWENNW";
        Set<String> set = new HashSet<>();
        set.add("(0,0)");
        int x = 0;
        int y = 0;

        for(char ch : path.toCharArray()){
            if(ch == 'N')y++;
            if(ch == 'S')y--;
            if(ch == 'E')x++;
            if(ch == 'W')x--;

            String temp = "("+x+","+y+")";
            if(set.contains(temp)) {
                System.out.println(true);
               return;
            }
            else set.add(temp);
        }
        System.out.println(false);
    }
}
