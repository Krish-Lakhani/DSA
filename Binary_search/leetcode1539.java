package Binary_search;

import java.util.Arrays;

public class leetcode1539
{
    public static void main(String[] args) {
          int[] arr = {1,2,3,4};
          int k = 2;
//        int left = 0, right = arr.length - 1;
//        while (left <= right) {
//            int mid = (right + left) / 2;
//            if (arr[mid] - mid - 1 < k) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//
//        System.out.println(left + k);

        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k) k++;
            else break;
        }
        System.out.println(k);

    }
}
