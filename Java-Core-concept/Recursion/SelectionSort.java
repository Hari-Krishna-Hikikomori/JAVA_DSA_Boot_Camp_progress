package JAVA;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr = {5,4,3,2,6};
        int[] arr2 = {5,4,3,2,6};
        sort(arr,0,1);
        Ksort(arr2,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static void sort(int[] arr, int i, int j)
    {
        if(i == arr.length-1)
        {
            return;
        }
        if(arr.length != j) {
            if (arr[i] > arr[j]) {
                swap(arr, i, j);
            }
            sort(arr,i,j+1);
        }
        else
        {
            sort(arr,++i,i+1);
        }

    }
    private static void Ksort(int[] arr, int i, int j)
    {
        if(i == 0)
        {
            return;
        }
        if(i != j) {
            if (arr[j] > arr[i]) {
                swap(arr, i, j);
            }
            Ksort(arr,i,j+1);
        }
        else
        {
            Ksort(arr,i-1,0);
        }

    }
}
