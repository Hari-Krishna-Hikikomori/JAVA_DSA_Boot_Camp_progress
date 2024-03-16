
public class SortAlgorithms
{
    void cycleSort(int[] arr)
    {

        int i = 0;
        while(i < arr.length)
        {
            if(arr[i] < arr.length && arr[i] !=i )
            {

                swap(arr, arr[i], i);

            }
            else
            {
                i++;
            }

        }
    }
    void cycleSort_One(int[] arr)
    {

        int i = 0;
        while(i < arr.length)
        {
            if(arr[i] < arr.length && arr[i] != i+1 )
            {

                swap(arr, arr[i]-1, i);

            }
            else
            {
                i++;
            }

        }
        
    }
    void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {

            int smallnum = i;
            for (int j = i+1; j < arr.length; j++) {

                if(arr[i] > arr[j])
                {
                    smallnum = j;
                }
            }
            swap(arr,smallnum,i);
        }
    }
    void insertSort(int[] arr)
    {
        boolean a = false;
        for (int i = 0; i < arr.length-1; i++)
        {
            a = false;
            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    swap(arr, i, j);
                    a = true;
                }
            }
            if(a == false)
            {
                break;
            }
        }
    }
    void bubbleSort(int[] arr)
    {
        boolean a = false;
        for (int i = 0; i < arr.length; i++)
        {
            a = false;
            for (int j = 0; j < arr.length-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap(arr, j+1, j);
                    a = true;
                }
            }
            if(a == false)
            {
                break;
            }
        }
    }

    private void swap(int[]arr,int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

