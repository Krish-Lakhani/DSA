package String;

import java.util.Arrays;

public class leetcode1844
{
    public static void main(String[] args) {
        String s = "a1b2c3d4e";
        char[] ch = s.toCharArray();

        for(int i=1; i<s.length(); i+=2)
        {
            ch[i] += ch[i-1] -'0';
        }
        System.out.println(String.valueOf(ch));
    }
}
