package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class leetcode2073
{
    public static void main(String[] args) {
        int[] tickets = {5,1,1,1};
        int k = 0;
        Queue<Integer> queue = new LinkedList<Integer>();

        int ans= 0;

        for(int i=0; i<tickets.length; i++)
        {
            queue.add(i);
        }

        while(!queue.isEmpty())
        {
            int idx = queue.remove();
            tickets[idx]--;
            ans++;

            if(tickets[idx] == 0 && idx == k)
            {
                System.out.println(ans);
            }

            if(tickets[idx] > 0)
            {
                queue.add(idx);
            }
        }
        System.out.println(ans);
    }
}
