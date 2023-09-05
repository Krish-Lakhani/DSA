package String;

import java.util.Arrays;

public class Qu6
{
    public static void main(String[] args) {
        String s = "zxerfh";
        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        s = new String(arr);
        System.out.println(s);
    }
}
