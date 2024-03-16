public class BinarySearch 
{
   public static void main(String[] args) 
   {
  int[]  arr = {100,99,88,77,66,55,44,33,22,11,0};
  int target = 100;
  System.out.println(arr.length-1);

  binarySearch(arr,target);
  
}

private static void binarySearch(int[] arr, int target) 
{
 int s = 0;
 int e = arr.length-1;
 int c = 0;
 boolean findorder = arr[s] < arr[e];
 while(s<=e)
 {
    c ++;
    int mid = s+(e - s)/2;
if(findorder)
{
    if(arr[mid] == target )
    {
        System.out.println(target+" is in index number "+ mid);
        System.out.println("find in "+c+" try");
        return ;
    }
    if (arr[mid]<target)
    {
        s = mid + 1;
    }
    else
    {
        e = mid -1;
    }
}
else
{
    if(arr[mid] == target )
    {
        System.out.println(target+" is in index number "+ mid);
        System.out.println("find in "+c+" try");
        return ;
    }
    if (arr[mid]>target)
    {
        s = mid + 1;
    }
    else
    {
        e = mid -1;
    }
}
    
 }
}    
}
