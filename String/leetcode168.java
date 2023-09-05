package String;

import java.util.Arrays;

public class leetcode168{
        public static void main(String[] args) {
                int n = 701;


                StringBuilder sb = new StringBuilder();
                while(n > 0) {
                        n--;
                        int curr = n % 26;
                        n /= 26;
                        sb.append((char) (curr + 'A'));
                }
                System.out.println(sb.reverse().toString());
        }
}
