package String;

public class leetcode2125
{
    public static void main(String[] args) {

        String[] str = {"011001","000000","010100","001000"};
        int ans = 0;
        int prev = 0;

        for (int i = 0; i < str.length; i++)
        {
            int count =0;
            for (int j = 0; j < str[i].length(); j++)
            {
                if(str[i].charAt(j)=='1') count++;
            }

            if(prev==0)
            {
                prev=count;
            }
            else
            {
                if(count!=0)
                {
                    ans+=(prev*count);
                    prev=count;
                }
            }
        }
        System.out.println(ans);
    }
}
