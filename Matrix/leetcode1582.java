package Matrix;

public class leetcode1582
{
    public static void main(String[] args) {
        int[][] mat = { {1,0,0},{0,0,1},{1,0,0}};
        int[] row = new int[mat.length];
        int[] col = new int[mat[0].length];
        int ans =0;

        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[0].length; j++)
            {
                if(mat[i][j] == 1)
                {
                    row[i]++;
                    col[j]++;
                }
            }
        }

        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[0].length; j++)
            {
                if(mat[i][j]==1 && row[i] == 1  && col[j] == 1)
                {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
