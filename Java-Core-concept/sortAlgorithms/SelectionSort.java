public class SelectionSort
{
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

        private void swap(int[] arr, int smallnum, int i) 
        {
            int temp = arr[smallnum];
            arr[smallnum] = arr[i];
            arr[i] = temp;
        }
}


