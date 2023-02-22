package ca.algo.major.sort;

public class Insert {
    public static void Sort(int[] arr)
    {
        for(int i = 1 ; i < arr.length; i++)
        {
            for(int j = i ; j > 0 ; j--)
            {
                // 比较索引j处的值和索引j-i处的值
                // 如果索引j-1处的值比索引j处的值大 交换
                // 否则 不交换
                if(greater(arr[j-1], arr[j]))
                {
                    exch(arr, j-1, j);
                }
                else
                {
                    break;
                }
            }
        }
    }

    private static boolean greater(int w, int v)
    {
        return w > v;
    }

    private static void exch(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
