package Stack_And_Queues;

public class CustomQueues
{
    private static final int DefualtSize = 10;
    private int size;
    protected int[] arr;

    protected int firstElement = 0;
    protected int lastElement = 0;
    CustomQueues()
    {
         this(DefualtSize);
    }
    CustomQueues(int size)
    {
        arr = new int[size];
        this.size = size;
    }
    public void add(int item)
    {
        if(size == lastElement + 1)
        {
            grow();
            arr[lastElement] = item;
            return;
        }
        arr[lastElement++] = item;
    }
    protected void grow()
    {
        int[] tamp = new int[size * 2];

        if (lastElement >= 0) System.arraycopy(arr, 0, tamp, 0, size);
        arr = tamp;
        size *= 2;
        firstElement = 0;
    }
    public int remove() throws CustomException {
        if(isEmpty())
        {

            throw new CustomException("Stack is Empty");
        }

        int tamp = arr[0];
        int[] tamparr = new int[--size];
        System.arraycopy(arr,1,tamparr,0,size);
        lastElement--;
        arr = tamparr;
        return tamp;
    }
    public int removeLast() throws CustomException {
        if(isEmpty())
        {
            throw new CustomException("Stack is Empty");
        }
        int last = arr[--lastElement];
        int[] tamp = new int[size];
        System.arraycopy(arr,0,tamp,0,lastElement);
        arr = tamp;
        last--;
        return last;
    }
    private boolean isEmpty()
    {
        return lastElement < 0;
    }
    public int peek()
    {
        return arr[0];
    }

}
