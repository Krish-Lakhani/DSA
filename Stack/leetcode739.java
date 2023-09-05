package Stack;
import java.util.*;

public class leetcode739 {
    public static void main(String[] args) {
        int[] temp = {73, 74, 75, 71, 69, 72, 76, 73};
        Stack<Integer> stack = new Stack<>();

        int[] ans = new int[temp.length];

        for (int i = 0; i < temp.length; i++) {
            while (!stack.empty() && temp[i] > temp[stack.peek()]) {
                ans[stack.peek()] = i - stack.peek();
                stack.pop();
            }

            stack.push(i);
        }
        System.out.println(Arrays.toString(ans));

    }
}