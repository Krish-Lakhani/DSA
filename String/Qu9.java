package String;

public class Qu9
{
    public static void main(String[] args) {
        String s = "Hello World";
        String[] str = s.split(" ");
        String s1 = "";
        for (int i = 0; i < str.length; i++)
        {
            str[i] = reverse(str[i]);
            s1 += str[i] + " ";
        }
        System.out.println(s1.trim());
    }

    public static String reverse(String s) {
        char[] ch = s.toCharArray();

        int left = 0;
        int right = ch.length - 1;

        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(ch);
    }
}
