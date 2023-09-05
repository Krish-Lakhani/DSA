import java.util.*;

public class Array
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int[] array = new int[10];
            int n = 5;
            //int m = 10;
            int sum = 0;

            int[] array1 = new int[10];
            for (int i = 0; i < n; i++)
            {
                array[i] = sc.nextInt();
                //array1[n-i-1] = array[i];
            }

//            for (int i = 0; i < n*2; i++)
//            {
//                array1[i] = sc.nextInt();
//            }

            //1 2
//            for (int i = 0; i < n; i++)
//            {
//                sum = sum + array[i];
//            }
//            System.out.println(sum/n);

            //3
//            int even = 0;
//            int odd = 0;
//            for (int i = 0; i < n; i++)
//            {
//               if(array[i] % 2 == 0){
//                   even++;
//               }else odd++;
//            }
//            System.out.println(even);
//            System.out.println(odd);

            //4
//            for (int i = n-1; i >= 0; i--)
//            {
//                System.out.print(array[i]);
//            }

            //7
//            for (int i = 0; i < n; i+=2)
//            {
//                System.out.println(array[i]);
//            }

            //8
//            for (int i = 0; i < n; i++)
//            {
//               if(array[i] % 2 != 0)
//               {
//                   System.out.print(array[i] + " ");
//               }
//            }
//            for (int i = 0; i < n; i++)
//            {
//                if(array[i] % 2 == 0)
//                {
//                    System.out.print(array[i] + " ");
//                }
//            }

            //9
//            int max = 0,secmax=0;
////
//            for (int i = 0; i < n; i++)
//            {
//                if(array[i]>max ){
//                   max=array[i];
//                }
//            }
//
//            for (int i = 0; i < n; i++)
//            {
//                if(array[i]<max){
//                    secmax=array[i];
//                }
//            }
//            System.out.println(max);
//            System.out.println(secmax);

//            //10
//            int[] array1 = new int[10];
//            for (int i = 1; i <= n; i++)
//            {
//                if(array[i]==array[i-1])
//                {
//                    array1[i] = array[i];
//                    System.out.println(array1[i]);
//                }
//            }

            //11

//            for (int i = 0; i < n; i++)
//            {
//                System.out.print(array1[i]);
//            }

            //12
//            for (int i = 0; i < n; i++)
//            {
//                for (int j = 0; j < m; j++)
//                {
//                    if (array[i] == array1[j])
//                    {
//                        System.out.println(array[i]);
//                    }
//                }
//            }

            //13
            for (int i = 0; i < n; i++)
            {
                array1[i] = array[i];
                array1[n+i]= array[i];
            }

            for (int i = 0; i < n*2; i++)
            {
                System.out.print(array1[i]);
            }


        }
    }


