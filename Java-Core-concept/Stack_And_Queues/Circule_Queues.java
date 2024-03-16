package Stack_And_Queues;

public class Circule_Queues extends CustomQueues
{
    private int totalElement = 0;
    Circule_Queues()
    {
        super();
    }
    Circule_Queues(int size)
    {
        super(size);
    }
    private boolean isFull()
    {
     return lastElement % arr.length == firstElement && totalElement != 0;
    }


    @Override
    public void add(int item)
    {
        if(isFull())
        {
            grow();
            arr[lastElement++ % arr.length] = item;
            totalElement++;
            return;
        }
        arr[lastElement++ % arr.length] = item;
        totalElement++;
    }

    @Override
    public int remove() throws CustomException
    {
        if(isEmpty())
        {
            throw new CustomException("Stack is EmptyException");
        }
        totalElement--;
        return arr[firstElement++ % arr.length];
    }

    @Override
    public int removeLast() throws CustomException {
        if(isEmpty())
        {
            throw new CustomException("Stack is EmptyException");
        }
        totalElement--;
        return arr[lastElement-- % arr.length];
    }

    @Override
    public int peek() {
        return super.peek();
    }

    private boolean isEmpty()
    {
        return lastElement == firstElement && totalElement == 0;
    }
    public void getall()
    {
        for (int i = firstElement; i != lastElement; i++)
        {
            System.out.print(arr[i % arr.length]+" ->");
        }
        System.out.println("END");
    }
    protected void grow()
    {
        int[] tamp = new int[arr.length * 2];
        int j = 0;
        for (int i = firstElement; i != lastElement; i++)
        {
            tamp[j++] = arr[i % arr.length];
        }
        firstElement = 0;
        lastElement  = arr.length;
        arr = tamp;

    }
}
