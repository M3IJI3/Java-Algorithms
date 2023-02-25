package ca.algo.major.test;

import ca.algo.major.sort.Insert;

import java.util.Arrays;

public class InsertTest {
    public static void main(String[] args) {
        int[] arr = {4,3,2,10,12,1,5,6,5};
        Insert.Sort(arr);
        //    InsertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

//    public static void InsertSort(int[] arr)
//    {
//        for(int i = 1 ; i < arr.length ; i++)
//        {
//            for(int k = i ; k > 0 ; k--)
//            {
//                if(arr[k-1] > arr[k])
//                {
//                    int temp = arr[k-1];
//                    arr[k-1] = arr[k];
//                    arr[k] = temp;
//                }
//                else
//                {
//                    break;
//                }
//            }
//        }
//    }
}
