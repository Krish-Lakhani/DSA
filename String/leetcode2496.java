package String;

public class leetcode2496
{
    public static void main(String[] args) {

        String[] s = {"alic3", "bob", "3", "4", "00000"};

        int max = 0;

        for (int i = 0; i < s.length; i++)
        {
            if(s[i].matches("[0-9]+"))
            {
                max=Math.max(max,Integer.parseInt(s[i]));
            }else
            {
                max=Math.max(max,s[i].length());
            }
            System.out.println(s[i].length());
           //max = Math.max(max,)
        }
    }
}
