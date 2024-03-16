public class TDbinarysearch {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };
        for (int i = 1; i <= 20; i++) {
            search(arr, i);
        }
    }

    private static void search(int[][] arr, int i) {
        int r = arr.length-1;
        int c = arr[0].length-1;
        int s = 0;
        int e = r; 
        int mid = 0;
        int midvalue = 0;
        while(s<=e)        {
        mid =  s +(e-s)/2;

        midvalue = arr[mid][c];

        if(midvalue == i)
        {
            System.out.println(midvalue);
            return;
        }

        if(midvalue < i)
        {            
           s = mid+1;
        }
        else
        {
           e = mid -1;
           int left  = 0;
           int right = c;
           int midd = 0; 
           while(left <=right)
           {
            midd = left+(right-left)/2;
            int midv = arr[mid][midd];
            if(midv == i)
        {
            System.out.println(midv);
            return;
        }


            if(i < arr[mid][midd])
            {
                right= midd - 1;
                
            }
            else
            {
                left = midd + 1;
            }
           }

        }

    }
}
}
