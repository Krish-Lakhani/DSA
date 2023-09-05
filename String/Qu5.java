package String;

public class Qu5
{
    public static void main(String[] args) {
        String s = "hello";
        char ch = 'o';

        // s = s.replace('e',ch);

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 'e')
            {
                arr[i] = 'o';
            }
        }
        s = new String(arr);
        System.out.println(s);
    }
}
