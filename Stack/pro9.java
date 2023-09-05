package Stack;

import java.util.Stack;

public class pro9 {
    public static void main(String[] args) {
        String s = "abcd*+-";
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*' || s.charAt(i) == '+' || s.charAt(i) == '-') {
                String left = stack.peek();
                stack.pop();
                String right = stack.peek();
                stack.pop();
                String ans = '(' + left + s.charAt(i) + right + ')';
                stack.push(ans);
            } else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(stack.peek());
    }
}
