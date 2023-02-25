package ca.algo.major.sort;

public class Shell {
    public static void ShellSort(int[] arr)
    {
        // 1. 根据数组arr的长度确定增长量h的初始值
        int h = 1;
        while(h < arr.length / 2)
        {
            h = 2 * h + 1;
        }
        // 2. 希尔排序
        while(h >= 1)
        {
            // 排序
            // 2.1 找到待插入的元素
            for(int i = h ; i < arr.length ; i++)
            {
                // 2.2 把待插入的元素插入有序元素中
                for(int k = i ; k >= h ; k -= h)
                {
                    // 待插入的元素是arr[k], 比较arr[k]和arr[k-h]
                    if(greater(arr[k-h],arr[k]))
                    {
                        //交换元素
                        exch(arr, k-h, k);
                    }
                    else
                    {
                        break;
                    }
                }
            }
            // 减小h的值
            h = h / 2;
        }
    }

    private static boolean greater(int w, int v)
    {
        return w > v;
    }

    private static void exch(int[] arr, int w, int v)
    {
        int temp = arr[w];
        arr[w] = arr[v];
        arr[v] = temp;
    }
}
