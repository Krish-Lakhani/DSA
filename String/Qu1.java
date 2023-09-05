package String;

public class Qu1
{
    public static void main(String[] args) {
        String s = "Hello";
//        StringBuilder sb = new StringBuilder(s);
//        System.out.println(sb.reverse());
        char[] ch = s.toCharArray();

        int left = 0;
        int right = ch.length-1;

        while (left < right)
        {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }

        String str = new String(ch);
        System.out.println(str);
    }
}
