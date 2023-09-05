package String;

import java.util.Arrays;

public class Qu12
{
    public static void main(String[] args) {
        String s1 = "ace";
        String s2 = "bdfh";
        String s3 ="";
//        StringBuilder sb = new StringBuilder();
//        int length = Math.min(s1.length() , s2.length());

            for (int i = 0; i < s1.length(); i++) {
               // sb.append(s1.charAt(i)).append(s2.charAt(i));
                s3 += s1.charAt(i);
                s3 += s2.charAt(i);
            }

//         if(s1.length() > length)
//         {
//             sb.append(s1.substring(length));
//         }
//         else if(s2.length() > length)
//         {
//             sb.append(s2.substring(length));
//         }
//            s1 = sb.toString();
        System.out.println(s3);
    }
}
