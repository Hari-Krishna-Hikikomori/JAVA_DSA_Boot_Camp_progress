public class foreachloop {
    public static void main(String[] args) 
    {
    int sum = 1;
    int nums[ ][ ] = new int[3][5];
    for(int i = 1; i < 3; i++)
    {
     for(int j = 1; j < 5; j++)
     {	 
      nums[i][j] = i * j;
            
    // Using for-each for to display and sum the values.
     for(int x[ ] : nums) 
     {
      for(int y : x) 
      {
        sum += y;
       }
      }
     }
    }	
    System.out.println("Sum: " + sum);
    }}