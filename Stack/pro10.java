package Stack;

import java.util.Stack;

public class pro10 {
    public static void main(String[] args) {
        String s = "*+-abcd";
        Stack<String> stack = new Stack<>();
        for (int i = s.length()-1; i>=0; i--) {
            if(s.charAt(i) == '*' || s.charAt(i) == '+' || s.charAt(i) == '-'){
                String left = stack.peek();
                stack.pop();
                String right = stack.peek();
                stack.pop();
                String ans = '('+ left + right + s.charAt(i)  + ')';
                stack.push(ans);
            }else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(stack.peek());
    }
}
