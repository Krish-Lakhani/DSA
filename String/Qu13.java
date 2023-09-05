package String;

import java.util.Locale;

public class Qu13
{
    public static void main(String[] args) {
        String s = "aba bcb Naman";

        String[] str = s.split(" ");

        boolean ans = true;

        for (String s1 : str) {
            if (!Pelindrome(s1)) {
                ans = false;
                break;
            }
        }

        if (ans) {
            System.out.println("All words are palindromes");
        } else {
            System.out.println("Not all words are palindromes");
        }
    }

    public static boolean Pelindrome(String s)
    {
        int l = 0 , r = s.length()-1;

        while (l < r) {
            if(s.charAt(l) != s.charAt(r))
            {
               return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
