package String;

import java.util.Arrays;

public class Qu7
{
    public static void main(String[] args) {

        String s = "Print frequency of all the characters in string";

        int[] arr = new int[128];

        for (int i = 0; i < s.length(); i++)
        {
            int ascii = s.charAt(i);
            arr[ascii] +=  1;
        }

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] > 0 )
                System.out.println((char)i + " " +arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
