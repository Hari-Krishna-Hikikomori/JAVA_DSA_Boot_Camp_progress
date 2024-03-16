package JAVA;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,1};
        int[] b   = {9,8,7,6,5,4,3,1};

        int[] c = Merge_Sort(b);                    //mycode recursion base both sub and main function
        My_Splite(b,0,b.length-1);           //mycode close to inplace sort (recursion base both sub and main function)
        mergeSortInPlace(arr,0,arr.length);       //kunal inplace sort (more memory efficient)
        inPlaceSort(arr,0,arr.length-1);   //mycode inplace my impression

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(b));
     }

    private static void inPlaceSort(int[] arr, int star, int end)
    {
        if(star == end || star > end )
        {
            return;
        }

        inPlaceSort(arr,star,star+(end - star)/2);
        inPlaceSort(arr,star+(end - star)/2+1,end);

        inPlaceMerge_Sort(arr,star,star+(end - star)/2,end);

    }

    private static void inPlaceMerge_Sort(int[] arr, int star, int mid, int end)
    {
        int[] newArr = new int[end - star+1];

        int s1 = star;
        int s2 = mid+1;
        int c = 0;

        while (s1 <= mid && s2 <= end)
        {
          if(arr[s1] < arr[s2])
          {
              newArr[c] = arr[s1];
              c++;
              s1++;
          }
          else
          {
              newArr[c] = arr[s2];
              c++;
              s2++;
          }
        }
        while(s1 <= mid)
        {
            newArr[c] = arr[s1];
            c++;
            s1++;
        }
        while (s2 <= end)
        {
            newArr[c] = arr[s2];
            c++;
            s2++;
        }

        for (int i = 0; i < newArr.length; i++)
        {
            arr[i+star] = newArr[i];
        }

    }

    static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int mid = (s + e) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
    private static void My_Splite(int[] b, int St, int Ed)
    {
        if(St == Ed || St > Ed )
        {
            return;
        }
        My_Splite(b,St,St+(Ed-St)/2);
        My_Splite(b,St+(Ed-St)/2+1,Ed);
        int[] arr = new int[(Ed - St)+1];
        Sort(b,arr,St,0,St,St+(Ed-St)/2,St+(Ed-St)/2+1,Ed);
    }

    private static void Sort(int[] b,int[] c,int st,int ct, int s1, int e1, int s2, int e2)
    {
        if(s1 > e1 && s2 > e2)
        {
            for (int i = 0; i < ct ; i++) {
                b[st+i] = c[i];
            }
            return;
        }
        if(s1 > e1)
        {
                c[ct] = b[s2];
                Sort(b,c,st,ct+1, s1, e1, s2+1, e2);
                return;
        }
        if(s2 > e2)
        {
            c[ct] = b[s1];
            Sort(b,c,st,ct+1, s1 + 1, e1, s2, e2);
            return;
        }
        if(b[s1] < b[s2])
        {
            c[ct] = b[s1];
            Sort(b,c,st,ct+1,s1+1, e1, s2, e2);
            return;
        }
        else
        {
            c[ct] = b[s2];
            Sort(b,c,st,ct+1, s1, e1, s2+1, e2);
            return;
        }
    }
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int[] Merge_Sort(int[] arr)
    {
      if(arr.length == 1)
      {
          return arr;
      }
      return MergeAnd_Sort(Merge_Sort(Arrays.copyOfRange(arr,0,arr.length/2)),Merge_Sort(Arrays.copyOfRange(arr,arr.length/2,arr.length)),Arrays.copyOf(arr, arr.length),0, 0, 0);
    }


    private static int[] MergeAnd_Sort(int[] first,int[] second,int[] com, int s,int e,int stop)
    {
        if(first.length == s)
        {
            if(e <= second.length-1)
            {
                com[stop] = second[e];
                return MergeAnd_Sort(first, second, com, s, e+1, stop+1);
            }
            else
            {
                return com;
            }
        }
        if(e == second.length)
        {
            com[stop] = first[s];
            return MergeAnd_Sort(first, second, com, s+1, e, stop+1);
        }
        if(first[s] < second[e])
        {
            com[stop] = first[s];
            return MergeAnd_Sort(first, second, com, s+1, e, stop+1);
        }
        else
        {
            com[stop] = second[e];
            return MergeAnd_Sort(first, second, com, s, e+1, stop+1);
        }
    }

}
