package JAVA;

public class Arrays_FindSortOrNot {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int [] arr2 = {1,2,3,3,4,5};

        findSort(arr2);
    }

    private static void findSort(int[] arr2)
    {
        SortCheck(arr2,0,arr2.length-1);
    }

    private static void SortCheck(int[] arr2, int i, int i1)
    {
        if(i == i1)
        {
            System.out.println("Array is Sorted");
            return;
        }

        if(arr2[i] < arr2[i+1] || arr2[i] == arr2[i+1])
        {
            SortCheck(arr2,++i,i1);
        }
        else System.out.println("Array is  Not-sorted");

        // return arr2[i] <= arr2[i+1] && SortCheck(arr2,++i,i1);   it wrks for boolean if both true
    }
}
