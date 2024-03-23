package Trees.Segment_Tree;

public class tes
{
    public static void main(String[] args)
    {
        int[] arr = {3,8,7,6,-2,-8,4,9,10};

        Segment_MK1 test = new Segment_MK1(arr);
        test.updateTrees(8,5);
        test.updateTrees(-8,1);
        test.Display();
        System.out.println(test.sumofRange(0, arr.length-1));
    }
}
