package String;

public class StringToInt 
{
    public static void main(String[] args) {
        String s1 = "123";
        int ans = 0;

        for (int i = 0; i < s1.length(); i++) 
        {
            int ascii = s1.charAt(i) - '0';
             ans = ans*10 + ascii;
        }
        System.out.println(ans);
    }
}
