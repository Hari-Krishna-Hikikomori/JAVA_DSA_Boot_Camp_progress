public class RecursionStep {
    public static void main(String[] args) {
        System.out.println(sum(4));
    }

    private static int sum(int i) {
         
        if(i == 0)
        {
            return i;
        }
        return i + sum(i-1);
    }
}
