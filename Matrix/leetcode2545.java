package Matrix;

public class leetcode2545
{
    public static void main(String[] args) {
        int[][] mat = {{10,6,9,1},{7,5,11,2},{4,8,3,15}};
        int k =2;
        System.out.println(sortTheStudents( mat , k));
    }

    public static int[][] sortTheStudents(int[][] score, int k) {
        for(int i = 0; i < score.length; i++){
            for(int j = 0; j < score.length; j++){
                if(score[i][k] > score[j][k]){
                    int[] temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
        }
        return score;
    }
}
