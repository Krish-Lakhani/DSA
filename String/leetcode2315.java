package String;

import java.util.Arrays;

public class leetcode2315
{
    public static void main(String[] args) {
        String s = "l|*e*et|c**o|*de|";
        String[] str = s.split("|");
        int count =0;

        for (String ss : str)
        {
            System.out.println(ss);
        }
//        for(int i=0; i<str.length; i++)
//        {
//            System.out.print(Arrays.toString(str));
////            if(s.charAt(i) == '*') count++;
////            i++;
//        }

    }
}
