package test.java.src;

public class Recursion_test
{
        public static void main(String[] args)
        {

            int[] arr = {11,22,33,44,55,66,77,88};
            int ans = Search(arr,88,0,arr.length);
            System.out.println(ans);
        }

        static int Search(int[] arr, int ans, int s,int e)
        {
            int m = (s+e)/2;

            if(arr[m]== ans)
            {
                return m;
            }
            if(arr[m] < ans)
            {
                return Search(arr, ans, m, e);
            }
            return Search(arr, ans, s, m);

        }


}
