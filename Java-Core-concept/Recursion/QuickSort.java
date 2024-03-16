package JAVA;

public class QuickSort {
    public static void main(String[] args) {

        int [] arr = {9,1,4,3,6,2,8,7};
        int s = 0;
        int e = arr.length-1;

       // sortQuick(arr,s,e);
        Kunal_QuickSort(arr,s,e);



    }

    private static void Kunal_QuickSort(int[] arr, int s, int e)
    {
        if(s>=e)return;
        int hig = e;
        int low = s;
        int pivot = arr[s+(e-s)/2];

        while (s <= e)
        {
            while (arr[s] < pivot)
            {
                s++;
            }
            while (arr[e] > pivot)
            {
               e--;
            }
            if(s<=e)
            {
                Swap(arr, s, e);
                s++;
                e--;
            }
        }

        Kunal_QuickSort(arr, low, e);
        Kunal_QuickSort(arr,s,hig);
    }

    private static void sortQuick(int[] arr, int s, int e)
    {
        if(s >= e)
        {
            return;
        }

        int m = s + (e - s)/2;
        Sorted(arr,s,e,arr[m]);
    }
    private static void Sorted(int[] arr, int s, int e, int pivot) {
        int star = s;
        int end = e;

        while (s < e) {
            if (arr[s] >= pivot && arr[e] <= pivot) {
                Swap(arr, s, e);
            }
            if (arr[s] > pivot || arr[e] > pivot) {
                --e;
                continue;
            } else {
                ++s;
                continue;
            }
        }

        sortQuick(arr, star, s - 1);
        sortQuick(arr, s + 1, end);
    }



//    private static void Sorted(int[] arr,int m, int s, int e, int pivot)
//    {
//        int star = s;
//        int end  = e;
//        while(s < e) {
//            if (arr[s] >= pivot && arr[e] <= pivot) {
//                Swap(arr, s, e);
//            }
//            if (arr[s] > pivot || arr[e] > pivot) {
//                --e;
//                continue;
//            }
//            else {
//                ++s;
//                continue;
//            }
//        }
//        sortQuick(arr, star, s-1);
//        sortQuick(arr, s+1, end);
//    }

//    private static void Sorted(int[] arr,int m, int s, int e, int pivot)
//    {
//        if(s >= e)
//        {
//            sortQuick(arr, 0, s-1);
//            sortQuick(arr,s+1,arr.length-1);
//            return;
//        }
//
//
//        if (arr[s] >= pivot && arr[e] <= pivot) {
//            Swap(arr, s, e);
//        }
//        if (arr[s] > pivot || arr[e] > pivot) {
//            Sorted(arr,m,s,e-1,pivot);
//        }
//        else {
//            Sorted(arr, m, s + 1, e, pivot);
//        }
//
//    }

    private static void Swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}

