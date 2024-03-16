package Java;

public class BinarySearch
{
    public static void main(String[] args) {
        int [] arr  = {1,2,3,4,5,10,9};
        for (int i = 1; i < 11;i++)
        {
            search(arr,i);
        }




    }
    static void search(int []arr, int i)
    {
       int ans = assign(arr,i,0,arr.length-1);
    }

    private static int assign(int[] arr, int tar,int s,int e)
    {
        int m = s + (e - s) / 2;
        if(s >= e || m-1 == -1)
        {
            return 0;
        }
        int ans = 0;

        if(arr[s+1] == arr[s]+1 && arr[m-1] == arr[m]-1 && tar >= arr[s] && tar <=arr[m] && arr[s] <= arr[m])
        {
            ans = binarySearch(arr,tar,s,m);
            if( ans == tar)
            {

                return ans;
            }
            else
            {
                ans = assign(arr,tar,m+1,e);
                return ans;
            }
        }
        if(arr[s+1] == arr[s]-1 && arr[m-1] == arr[m]+1 && tar <= arr[s] && tar >= arr[m] && arr[s] >= arr[m])
        {
            ans = binarySearch_revers(arr,tar,s,m);
            if( ans == tar)
            {

                return ans;
            }
            else
            {
                ans = assign(arr,tar,m+1,e);
                return ans;
            }
        }
        if(arr[e-1] == arr[e]-1 && arr[m+1] == arr[m]+1 && tar >= arr[m] && tar <= arr[e] && arr[m] <= arr[e])
        {
            ans = binarySearch(arr, tar, m, e);
            if( ans == tar)
            {

                return ans;
            }
            else
            {
                ans = assign(arr,tar,s,m-1);
                return ans;
            }
        }
        if(arr[e-1] == arr[e]+1 && arr[m+1] == arr[m]-1 && tar <= arr[m] && tar >= arr[e] && arr[m] >= arr[e])
        {
            ans = binarySearch_revers(arr,tar,m,e);
            if( ans == tar)
            {

                return ans;
            }
            else
            {
                ans = assign(arr,tar,s,m-1);
                return  ans;
            }
        }
        if(ans == tar)
        {

            return ans;
        }
        ans = assign(arr, tar, s+1, e);
        if(ans == tar)
        {

            return ans;
        }
        ans = assign(arr,tar,s,e-1);
        if(ans == tar)
        {

            return ans;
        }

        return 0;
    }

    private static int binarySearch_revers(int[] arr, int tar, int s, int e)
    {
        if(s > e)
        {
            return 0;
        }
        int m = s + (e-s)/2;
        if(tar == arr[m])
        {
            System.out.println(tar+" in the index number "+m);
            return arr[m];
        }
        if(tar > arr[m]) {
            return binarySearch_revers(arr, tar, s, --m);
        }

        return binarySearch_revers(arr,tar,++m,e);
    }

    private static int  binarySearch(int[]arr,int tar, int s,int e)
    {
        if(s > e)
        {
            return 0;
        }
        int m = s + (e-s)/2;
        if(tar == arr[m])
        {
            System.out.println(tar+" in the index number "+m);
            return arr[m];
        }
        if(tar > arr[m]) {
            return binarySearch(arr, tar, ++m, e);
        }

        return binarySearch(arr,tar,s,--m);
    }
}
