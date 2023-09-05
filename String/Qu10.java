package String;

public class Qu10
{
    public static void main(String[] args) {
        String s = "hello worlde";
        int[] arr = new int[128];

        for (int i = 0; i < s.length(); i++)
        {
            int ascii = s.charAt(i);
            arr[ascii] = arr[ascii] + 1;
        }

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] > 1 )
                System.out.println((char)i + " " +arr[i]);
        }
    }
}
