package String;

import java.util.Arrays;

public class leetcode1528
{
    public static void main(String[] args) {

        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        char[] ans  = new char[indices.length];

        for (int i = 0; i < indices.length; i++)
        {
            ans[indices[i]] = s.charAt(i);
        }

      //  String ans1 = new String(ans);
        System.out.println(Arrays.toString(ans));
    }
}
