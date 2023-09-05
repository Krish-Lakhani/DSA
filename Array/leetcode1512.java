package Array;

public class leetcode1512
{
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int count = 0;
        int[] array = new int[101];
        for (int i: nums) {
            count += array[i]++;
        }
        System.out.println(count);
    }
}
