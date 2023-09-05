package Matrix;

public class letcode2643
{
    public static void main(String[] args) {
        int[][] mat = { {0,0},{1,1},{0,0} };
        int max =0 , res = 0;
        for(int i = 0; i < mat.length; i++){
            int count = 0;
            for (int j = 0; j < mat[0].length; j++) {
                count += mat[i][j];
            }
            if(count > max){
                max = count;
                res = i;
            }
        }
       // return new int[]{res, max};
    }
}
