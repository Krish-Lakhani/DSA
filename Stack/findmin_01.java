package Stack;

import java.util.Stack;

import java.util.Stack;

public class findmin_01 {

    static int minValue;
    static Stack<Integer> stack = new Stack<>();


    public static void main(String[] args) {

        // Function calls
        push(3);
        push(5);
        getMin();
        push(2);
        push(1);
        getMin();
        pop();
        getMin();
        pop();
        peek();
    }

     public static void push(int value) {
            if(stack.isEmpty()){
                stack.push(value);
                minValue = value;
                System.out.println("Inserted value is :" + value);
                return;
            }else{
                if(minValue >= value){
                    stack.push((2 * value) - minValue);
                    minValue = value;
                }else{
                    stack.push(value);
                }
            }
            System.out.println("Inserted value is : " + value);
        }

        public static void pop(){
            if(stack.isEmpty()){
                System.out.println("Stack is empty");
                return;
            }
            if(minValue >= stack.peek()){
                System.out.println("popped value is : " + minValue);
                minValue = 2 * minValue - stack.pop();
            }else{
                System.out.println("popped value is : " + stack.pop());
            }
        }

        public  static void peek(){
            if(stack.isEmpty()){
                System.out.println("Stack is empty");
                return;
            }

            if(minValue >= stack.peek()){
                System.out.println("Peek element is : "+minValue);
            }else{
                System.out.println("Peek element is : " + stack.peek());
            }
        }

        public static void getMin(){
            if (stack.isEmpty()){
                System.out.println("Stack is empty");

            }
            System.out.println("min value is :=" + minValue);
        }
    }


