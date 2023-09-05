package String;

import java.util.Arrays;

public class leetcode1589
{
    public static void main(String[] args) {

       String s = "is2 sentence4 This1 a3";
        String[] str =  s.split(" ");
        String[] ans = new String[str.length];

        int idx = 0;
        for (String s1 : str)
        {
            idx = (int)(s1.charAt(s1.length() - 1) - '0');
            ans[idx-1] = s1.substring(0, s1.length() - 1);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ans.length; i++) {
            sb.append(ans[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
