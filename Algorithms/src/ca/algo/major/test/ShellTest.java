package ca.algo.major.test;

import ca.algo.major.sort.Shell;

import java.util.Arrays;

public class ShellTest {
    public static void main(String[] args) {
        int[] arr = {9,1,2,5,7,4,8,6,3,5};
        Shell.ShellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
