package String;

import java.util.Arrays;

public class leetcode1859
{
    public static void main(String[] args) {

        String s = "is2 sentence4 This1 a3";
        StringBuilder sb = new StringBuilder(s);

        for (int i = 1; i < s.length()-1; i++)
        {
            if(s.equals(" "))
            {
                sb.deleteCharAt(i-1);
            }
        }

        System.out.println(sb.toString());
    }
}
