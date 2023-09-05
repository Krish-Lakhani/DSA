package String;

import java.util.Arrays;

public class leetcode1451
{
    public static void main(String[] args) {

        String s = "Letcode is cool";
        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++)
        {
            for (int j = 0; j < str.length-i-1; j++)
            {
                if(str[j].length() > str[j+1].length())
                {
                    String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
        String ans = "";
        for (String s1 : str)
        {
            ans += s1 + "";
        }

    }
}
