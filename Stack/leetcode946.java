package Stack;

import java.util.*;

public class leetcode946
{
    public static void main(String[] args) {

        int[] pushed = {1,2,3,4,5} , popped = {4,5,3,2,1};
        System.out.println(validateStackSequences(pushed,popped));
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack();
        int point = 0;
        for (int i = 0; i < pushed.length; i++) {
            if (pushed[i] != popped[point]) {
                stack.push(pushed[i]);
            } else {
                point++;
            }
        }
        while (!stack.empty()) {
            if (stack.peek() == popped[point]) {
                stack.pop();
                point++;
            } else {
                return false;
            }
        }
        return stack.empty();
    }
}
