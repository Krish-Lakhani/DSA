package String;

import java.util.Arrays;

public class Qu15
{
    public static void main(String[] args) {
        String s = "Hello World";
        boolean[] arr = new boolean[128];
        String s1 = "";
        //StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray() )
        {
            if(!arr[c])
            {
                arr[c] = true;
                s1 += c;
            }
        }
        s = s1.toString();
        System.out.println(s);

    }
}
