package String;

import java.util.Arrays;

public class Qu3
{
    public static void main(String[] args) {
           String s = "How are you beauty";

           int count=0;

        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == ' ') count++;
        }
        System.out.println(count +1);

//        String[] str = s.split(" ");
//        System.out.println(str.length);



    }
}
