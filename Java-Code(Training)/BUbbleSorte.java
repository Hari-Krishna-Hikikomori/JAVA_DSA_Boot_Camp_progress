import java.util.Arrays;

public class BUbbleSorte
{
    public static void main(String[] args)
    {
        int arr[] = {5,4,3,2,1,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


    private static void sort(int[] arr)
    {
        boolean swapped ;
        for (int i = 0; i < arr.length-1; i++)
        {
            swapped = false;
            int a = arr.length -i-1;
            for (int j = 0; j < a; j++)
            {
                if (arr[j]>arr[j+1])
                {

                    swap(arr,i,j);

                    swapped = true ;
                }

            }
            if(swapped=false)
            {
                break;
            }

        }
    }

}