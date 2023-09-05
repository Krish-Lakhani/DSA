package String;

import java.util.Arrays;

public class permution
{
    public static void main(String[] args) {
        String s1 = "abca";
        String s2 = "abac";
        int[] ans = new int[128];

        for (int i = 0; i < s1.length(); i++)
        {
            int ascii = s1.charAt(i);
            int ascii2 = s2.charAt(i);
            ans[ascii] = ans[ascii] + 1;
            ans[ascii2] = ans[ascii2] + 1;
        }

        for (int i = 0; i < ans.length; i++)
        {
            if(ans[i] == 0) continue;
            if(ans[i] % 2 == 0)
            {
                System.out.println(true);
                break;
            }
            else {
                System.out.println(false);
                break;
            }
        }

    }
}
