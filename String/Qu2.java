package String;

public class Qu2
{
    public static void main(String[] args) {
        String s = "naman";

        int l = 0 , r = s.length()-1;

        while (l < r) {
            if(s.charAt(l) != s.charAt(r))
            {
                System.out.println("Not plindorm");
                break;
            }
            if(s.charAt(l) == s.charAt(r))
            {
                System.out.println("plindrom");
                break;
            }
            l++;
            r--;
        }
    }
}
