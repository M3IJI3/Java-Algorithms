package ca.algo.major.test;

import ca.algo.major.sort.Selection;

import java.util.Arrays;

public class SelectionTest {
    public static void main(String[] args) {
        int[] arr = {4,6,8,7,9,2,10,1};

        Selection.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

//    public static void SelectionSort(int[] arr)
//    {
//        for(int i = 0 ; i < arr.length - 1 ; i++)
//        {
//            int indexOfMinNum = i;
//            for(int k = i + 1; k < arr.length ; k++)
//            {
//                if(arr[indexOfMinNum] > arr[k])
//                {
//                    indexOfMinNum = k;
//                }
//            }
//
//            int temp;
//            temp = arr[i];
//            arr[i] = arr[indexOfMinNum];
//            arr[indexOfMinNum] = temp;
//        }
//    }
}
