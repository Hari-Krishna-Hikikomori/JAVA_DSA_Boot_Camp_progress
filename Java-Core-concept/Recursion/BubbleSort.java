package JAVA;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};

        KunalSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static void sort(int[] arr, int i, int j)
    {
        if(arr.length-1 == i)
        {
            return;
        }
        if(arr[i] > arr[j])
        {
            swap(arr,i,j);
            sort(arr,i+1,j+1);
        }
        else
        {
            sort(arr,i+1,j+1);
            return;
        }
        sort(arr, 0, 1);

    }
    static void KunalSort(int[] arr, int i, int j)
    {
        if(i == 0)
        {
            return;
        }

        if(i > j)
        {
            if(arr[j] > arr[j+1])
            {
                swap(arr,j,j+1);
            }
            KunalSort(arr,j,j+1);
        }
        else
        {
            KunalSort(arr,i-1,0);
        }
    }
}
