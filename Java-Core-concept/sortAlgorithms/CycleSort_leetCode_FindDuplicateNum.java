import java.util.ArrayList;


public class CycleSort_leetCode_FindDuplicateNum
{
    public static void main(String[] args) {

        int[] arr = {1,3,4,2,2,5,5,6,6};
        ArrayList<Integer> Dup = FindDuplicateNum(arr);
        System.out.println(Dup);

    }

    static ArrayList<Integer> FindDuplicateNum(int[] arr)
    {
        cycleSort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 1;

        while(i < arr.length)
        {

            if(arr[i] != i+1)
            {
                ans.add(arr[i]);
            }
            i++;
        }
        return ans;
    }

    static void cycleSort(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            a:

            if(arr[i] != i+1 && arr[i] < arr.length)
            {
                if(arr[i] == arr[arr[i]-1])
                {
                    i++;
                    break a;
                }
                swap(arr,arr[i]-1,i);
            }
            else i++;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
