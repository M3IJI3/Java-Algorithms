package ca.algo.major.sort;

public class Bubble {
    /*
    * 对数组a中的元素进行排序
    * */
    public static void sort(int[] arr)
    {
        // { 1, 2, 3, 4, 5 }
        for(int i = arr.length - 1 ; i > 0 ; i--)
        {
            for(int j = 0 ; j < i ; j++)
            {
                if(greater(arr[j], arr[j+1]))
                {
                    exch(arr, j, j + 1);
                }
            }
        }
    }

    /*
    * 比较v元素是否大于w元素
    * */
    private static boolean greater(int v, int w)
    {
        return v - w > 0;
    }

    /*
    * 数组元素i和j交换位置
    * */
    private static void exch(int[] a, int i, int j)
    {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
