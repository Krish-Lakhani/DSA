package String;

public class leetcode1910
{
    public static void main(String[] args) {

        String s = "daabcbaabcbc";
        String part = "abc";

        StringBuilder sb = new StringBuilder();
        sb.append(!s.contains(part));
    //s.contains(part);
        s = new String(sb);
        System.out.println(s);
    }
}
