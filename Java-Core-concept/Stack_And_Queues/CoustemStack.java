package Stack_And_Queues;

public class CoustemStack{

    private int[] arr;
    private static final int defualSize = 10;
    private int elementcount = -1;
    private int size;
    CoustemStack()
    {
        this(defualSize);
    }
    CoustemStack(int size)
    {
        this.arr = new int[size];
        this.size = size;
    }
    public void push(int val)
    {
        if(size == elementcount + 1)
        {
            grow();
            arr[elementcount] = val;
            return;
        }
        arr[++elementcount] = val;
    }
    private void grow()
    {
        int[] tamp = new int[size * 2];

        if (elementcount >= 0) System.arraycopy(arr, 0, tamp, 0, size);
        arr = tamp;
        size *= 2;
        elementcount++;
    }
    public int pop() throws CustomException {
        if(isEmpty())
        {
            throw new CustomException("Stack is Empty");
        }
        int ret = arr[elementcount];
        int[] tamp = new int[--size];
        System.arraycopy(arr,0,tamp,0,size);
        arr = tamp;
        elementcount--;
        return ret;
    }

    private boolean isEmpty()
    {
        return elementcount < 0;
    }
    public void getall()
    {
        for (int i = 0; i <= elementcount; i++)
        {
            System.out.print(arr[i]+" ->");
        }
        System.out.println("END");
    }
    public int peek()
    {
        return arr[elementcount];
    }
    public int removeFirst() throws CustomException {
        if(isEmpty())
        {
            throw new CustomException("Stack is Empty");
        }

        int tamp = arr[0];
        int[] tamparr = new int[--size];
        System.arraycopy(arr,1,tamparr,0,size);
        elementcount--;
        return tamp;
    }
}
