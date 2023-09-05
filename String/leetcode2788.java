package String;

import java.util.ArrayList;

public class leetcode2788 {
    public static void main(String[] args) {
        ArrayList<String>words = new ArrayList<>();
        words.add("one.two.three");
        words.add("four.five");
        words.add("six");
        String separator = ".";
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            String[] arry = words.get(i).split(".");
            for (int j = 0; j < arry.length; j++) {
                ans.add(arry[j]);
            }
        }
        System.out.println(ans);
    }
}
