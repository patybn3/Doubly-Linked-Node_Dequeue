/*this class uses an array to simulate a queue, numbers are added to the array through
a loop, passed by the main method on file Chapter4_15_PatriciaAntlitz.java.
This class can print the size and the list of numbers, remove, add from both front and end of the list
 */

public class DeQue<T> implements DequeInterface<T>
{
    protected DLLNode<T> front;     // reference to the front of this queue
    protected DLLNode<T> rear;      // reference to the rear of this queue
    protected int numElements = 0; // number of elements in this queue

    public DeQue()
    {
        front = null;
        rear = null;
    }

    @Override
    public void enqueueFront(T element) throws QueueOverflowException
    {
        System.out.println("\nAdding " + element + " to The Front:");

        DLLNode<T> newNodeFront = new DLLNode<T>(element);

        if (isFull())
        {
            throw new QueueUnderflowException("Enqueue attempted on a full queue.");
        }
        else
        {
            newNodeFront.setForward(front);
            front = newNodeFront;
            numElements++;
        }
    }

    @Override
    public void enqueueRear(T element) throws QueueOverflowException
    {
        DLLNode<T> newNodeBack = new DLLNode<T>(element);

        if (isFull())
            throw new QueueUnderflowException("Enqueue attempted on a full queue.");
        else
        {
            if (rear == null)
                front = newNodeBack;
            else
            rear.setForward(newNodeBack);
            rear = newNodeBack;
            numElements++;
        }
    }

    @Override
    public T dequeueFront() throws QueueUnderflowException
    {
        System.out.println("\nRemoving First Element:");
        if (isEmpty())
            throw new QueueUnderflowException("Dequeue attempted on empty queue.");
        else
        {
            T element;
            element = front.getInfo();
            front = front.getForward();
            if(front == null)
                rear = null;
            numElements--;
            return element;
        }
//        return null;
    }

    @Override
    public T dequeueRear() throws QueueUnderflowException
    {
        System.out.println("\nItem Removed From The Back:");

        if (isEmpty())
            throw new QueueUnderflowException("dequeue rear attempted on empty queue.");

        DLLNode<T> element = front;

        while(element.getForward().getForward() != null)
        {
            element = element.forward;
        }
        element.forward = null;
        numElements--;
        return element.info;
    }

    public boolean isFull()
    // Returns true if this queue is full; otherwise, returns false.
    {
        return false;
    }

    public boolean isEmpty()
    // Returns true if this queue is empty; otherwise, returns false.
    {
        return (numElements == 0);
    }

    public int size()
    // Returns the number of elements in this queue.
    {
        return numElements;
    }

    public String toString()
    {
        String getString = "";
        DLLNode<T> itemFront = front;
        //exception
        if(isEmpty()) {
            throw new QueueUnderflowException("Error. Queue is Empty.");
        }
        while(itemFront != null)
        {
            getString += itemFront.getInfo().toString() + " ";
            itemFront = itemFront.getForward();
        }
        System.out.println(getString);
        return getString;
    }
}
