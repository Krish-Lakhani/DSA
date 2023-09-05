import java.util.Arrays;
import java.util.Scanner;

public class BinarySerch
{
    public static void main(String[] args) {
        //int[] array = {1,4,5,7,9};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n+1];
        int value = 8;
        int left = 0;
        int right = array.length-1;

        for (int i = 0; i < array.length; i++)
        {
            array[i] = sc.nextInt();
        }

//        while(left <= right)
//        {
//            int mid = (left+right)/2;
//            if(array[mid]==value)
//            {
//                System.out.println(mid);
//                break;
//            } else if (array[mid]>value)
//            {
//                right--;
//            }else {
//                left++;
//            }
//        }

//        while(left < right)
//        {
//           // int mid = (left+right)/2;
//            if(array[left]%2==0)
//            {
//                left++;
//            } else if (array[right]%2!=0)
//            {
//                right--;
//            }else {
//                int temp = array[left];
//                array[left]=array[right];
//                array[right]=temp;
//                left++;
//                right--;
//            }
//        }
//        for (int i = 0; i < array.length; i++)
//        {
//            System.out.print(array[i]);
//        }

                            // second largest..................
//        int max1 = 0 , max2 = 0 ;
//
//        for (int i = 0; i < array.length; i++)
//        {
//                if(array[i] > max1)
//                {
//                    max2 = max1;
//                    max1 = array[i];
//                }
//                else if(array[i] > max2  && array[i]!=max1 && array[i]!=max2)
//                {
//                    max2 = array[i];
//                }
//        }
//        System.out.println(max2);

                // third largest................
     //   int max1 = 0 , max2 = 0 , max3= 0;

//        for (int i = 0; i < array.length; i++)
//        {
//            if(array[i] > max1)
//            {
//                max3 = max2;
//                max2 = max1;
//                max1 = array[i];
//            }
//            else if(array[i] > max2  && array[i]!=max1 )
//            {
//                max3 = max2;
//                max2 = array[i];
//            }
//            else if(array[i] > max3 && array[i]!=max2)
//            {
//                max3 = array[i];
//            }
//        }
//        System.out.println(max3);

                // sum......................
//       while (left < right)
//       {
//                if(array[left] + array[right] < value)
//                {
//                    left++;
//                } else if (array[left] + array[right] > value) {
//                    right--;
//                }
//                else
//                {
//                    System.out.println(array[left]  + " " + array[right]);
//
//                    break;
//                }
//        }

        //find duplicate..................
//        int sum1 = 0;
//        for (int i = 0; i < array.length; i++)
//        {
//             sum1 = sum1 + array[i];
//        }
//
//        int sum2 = ((n*n)+n)/2;
//
//        System.out.println(sum1 - sum2);
    }
}
