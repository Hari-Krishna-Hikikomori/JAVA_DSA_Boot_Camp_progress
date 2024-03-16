package Java;
import Java.BinarySearch;

public class Rotated_BinarySearch {
    public static void main(String[] args) {
        int [] arr  = {1,2,3,4,5,10,9,8,7,6};
        int [] arr2 = {5,6,7,8,1,2};
        int tar = 1;
       for (int i = 1; i <11 ; i++)
        {
            rotateSearch(arr,10);
        }


    }

    private static void rotateSearch(int[] arr,int tar)
    {
     int ans =  binarySearch(arr,0,arr.length-1,tar);
    }
    private static int binarySearch(int[] arr,int st,int end,int tar)
    {
        int mid = st+(end - st)/2;
        if(arr[mid] == tar)
        {
            System.out.println(tar+" Anser found in index num "+mid);
            return mid;
        }

        return -1;
    }
}
