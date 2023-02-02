package ca.algo.major.sort;

public class Selection {
    public static void sort(int[] arr)
    {
        for(int i = 0 ; i < arr.length - 1 ; i++)
        {
            // define a var to store the index of the minimum number
            int minIndex = i;
            for(int k = i + 1 ; k < arr.length ; k++)
            {
                if(greater(arr[minIndex], arr[k]))
                {
                    minIndex = k;
                }
            }

            // exchange the minimum number
            exch(arr, i, minIndex);
        }
    }

    private static boolean greater(int w, int v)
    {
        return w - v > 0;
    }

    private static void exch(int[] arr, int i, int j)
    {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
