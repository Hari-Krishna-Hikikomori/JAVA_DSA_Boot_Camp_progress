import java.util.Arrays;
class Solutio{
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {            
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return new  int [0];
    }
}

public class leet_test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 7, 9, 4, 8, 6};
        int tar = 9;
        Solutio obj = new Solutio();
        System.out.println(Arrays.toString(obj.twoSum(array, tar)));
    }
}