package String;

public class leetcode2023
{
    public static void main(String[] args) {
        String[] str = {"777","7","77","77"};
        String  target = "7777";
        int count =0;

        for (int i = 0; i < str.length; i++)
        {
            for (int j = 0; j < str.length; j++) {

                if(i != j)
                {
                    String s = str[i] + str[j];
                     if(s.equals(target))
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
