package Stack;
import java.util.*;

public class leetcode1475
{
    public static void main(String[] args) {
        int[] prices = {8,4,6,2,3};

        Stack<Integer> stack = new Stack<>();

        for (int i=prices.length-1; i>=0; i--) {

            while (!stack.isEmpty() && stack.peek() > prices[i]) {

                stack.pop();
            }

            int price = prices[i];

            if (!stack.isEmpty()) {

                prices[i] = prices[i] - stack.peek();
            }

            stack.push(price);
        }

        System.out.println(Arrays.toString(prices));
    }
}
