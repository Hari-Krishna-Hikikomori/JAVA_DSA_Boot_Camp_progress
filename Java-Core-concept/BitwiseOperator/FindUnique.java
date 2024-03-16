package BitwiseOperator;

public class FindUnique {
    public class Main {
        public static void main(String[] args) {
            int arr[] = {1, 2, 3, 4, 6,6,6,7,7,7 ,8,8,8, 4, 3, 2, 2, 3, 4, };
    
            // Print the unique number
            System.out.println(findUnique(arr));
            Unique(arr); 
        }
    
        private static int findUnique(int[] arr) {
            int ones = 0, twos = 0;
    
            for (int i : arr) {
                ones = (ones ^ i) & ~twos;
                twos = (twos ^ i) & ~ones;
            }
    
            return ones;
        }
    
    
    




    private static int Unique(int[] arr) 
    {
        int Unique = 0;

        for(int n : arr)
        {
          Unique ^= n;
         System.out.println(n+"   "+Unique); 
        }
        return Unique;
    }
}
}
