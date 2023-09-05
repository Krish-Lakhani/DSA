package Matrix;

public class leetcode999
{
    public static void main(String[] args) {
        String[][] board = {{".",".",".",".",".",".",".","."},{".",".",".","p",".",".",".","."},{".",".",".","R",".",".",".","p"},{".",".",".",".",".",".",".","."},{".",".",".",".",".",".",".","."},{".",".",".","p",".",".",".","."},{".",".",".",".",".",".",".","."},{".",".",".",".",".",".",".","."} };
        int count =0;
        int row =0,col =0;
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[0].length; j++)
            {
                if(board[i][j]=="R")
                {
                    row = i;
                    col = j;
                    break;
                }
            }
        }

        for(int i=row; i<board[0].length; i++)
        {
            if(board[i][col] == "P") {
                count++;
                break;
            }
            else if(board[i][col] == "B")  break;
        }

        for(int i=row; i>=0; i--)
        {
            if(board[i][col] == "P") {
                count++;
                break;
            }
            else if(board[i][col] == "B")   break;
        }

        // col
        for(int j=col; j<board[0].length; j++)
        {
            if(board[row][j] == "P") {
                count++;
                break;
            }
            else if(board[row][j] == "B")  break;
        }

        for(int j=col; j>=0; j--)
        {
            if(board[row][j] == "P") {
                count++;
                break;
            }
            else if(board[row][j] == "B")   break;

        }
        System.out.println(count);
    }
}
