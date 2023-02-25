package ca.algo.major.test;

import ca.algo.major.sort.Shell;

import java.util.Arrays;

public class ShellTest {
    public static void main(String[] args) {
        int[] arr = {9,1,2,5,7,4,8,6,3,5};
        Shell.ShellSort(arr);
        //ShellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

//    public static void ShellSort(int[] arr)
//    {
//        // 确定h的值
//        int h = 1;
//        while(h < arr.length / 2)
//        {
//            h = 2 * h + 1;
//        }
//
//        while(h >= 1)
//        {
//            for(int i = h ; i < arr.length ; i++)
//            {
//                for(int k = i ; k >= h ; k -= h)
//                {
//                    if(arr[k] < arr[k-h])
//                    {
//                        int temp = arr[k];
//                        arr[k] = arr[k-h];
//                        arr[k-h] = temp;
//                    }
//                    else
//                    {
//                        break;
//                    }
//                }
//            }
//            // 减少h的值
//            h = h / 2;
//        }
//    }
}
