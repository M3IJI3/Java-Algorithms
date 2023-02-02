package ca.algo.major.test;

import ca.algo.major.sort.Bubble;

import java.util.Arrays;

public class BubbleTest {
    public static void main(String[] args){
        int[] arr  = {4,5,6,3,2,1};

        Bubble.sort(arr);
        //BubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

//    public static void BubbleSort(int[] arr)
//    {
//        for(int i = arr.length - 1; i > 0 ; i--)
//        {
//            for(int k = 0 ; k < i; k++)
//            {
//                if(arr[k] < arr[k+1])
//                {
//                    int temp = arr[k];
//                    arr[k] = arr[k+1];
//                    arr[k+1] = temp;
//                }
//            }
//        }
//    }
}
