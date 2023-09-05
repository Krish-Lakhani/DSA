package String;

public class leetcode657
{
    public static void main(String[] args) {
        String moves = "UP";

        char[] ch = new char[moves.length()];

        int x = 0, y = 0;
        for (char move: moves.toCharArray()) {
            if (move == 'U') y--;
            else if (move == 'D') y++;
            else if (move == 'L') x--;
            else if (move == 'R') x++;
        }
        System.out.println(x == 0 && y == 0);
    }
}
