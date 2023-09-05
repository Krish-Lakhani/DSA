package String;

public class swap_string
{
    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "xyz";

        char[] ch = s1.toCharArray();

        s1 = s2;
        s2 = String.valueOf(ch);

        System.out.println(s1);
        System.out.println(s2);
    }
}
