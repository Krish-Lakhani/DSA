package String;

public class Qu4
{
    public static void main(String[] args) {
        String s1 = "hell0";
        String s2 = "hello";
        int flag = 1;
        //System.out.println(s1.equals(s2));
        if(s1.length() == s2.length())
        {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    flag = 0;
                    break;
                }
            }
        }
        else flag = 0;

        if(flag == 0) System.out.println(false);
        if(flag == 1) System.out.println(true);
    }
}
