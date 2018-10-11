
// Queue.java
// demonstrates queue
// to run this program: C>java QueueApp
////////////////////////////////////////////////////////////////
/**
 * Gurinder Singh
 * 1152715
 * 9/22/18
 * @version (a version number or a date)
 */
class Queue
{
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;
    //--------------------------------------------------------------
    public Queue(int s)          // constructor
    {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    //--------------------------------------------------------------
    public void insert(long j)   // put item at rear of queue
    {
        if(rear == maxSize-1)         // deal with wraparound
            rear = -1;
        queArray[++rear] = j;         // increment rear and insert
        nItems++;                     // one more item
    }
    //--------------------------------------------------------------
    public long remove()         // take item from front of queue
    {
        long temp;
        temp = queArray[front++]; // get value and incr front
        if(front == maxSize)           // deal with wraparound
            front = 0;
        nItems--;                      // one less item
        return temp;
    }
    //--------------------------------------------------------------
    public long peekFront()      // peek at front of queue
    {
        return queArray[front];
    }
    //--------------------------------------------------------------
    public boolean isEmpty()    // true if queue is empty
    {
        return (nItems==0);
    }
    //--------------------------------------------------------------
    public boolean isFull()     // true if queue is full
    {
        return (nItems==maxSize);
    }
    //--------------------------------------------------------------
    public int size()           // number of items in queue
    {
        return nItems;
    }

    public void display(Queue q)
    {
        while( !q.isEmpty() )    // remove and display
        {                            //    all items
            long n = q.remove();  // (40, 50, 60, 70, 80)
            System.out.print(n);
            System.out.print(" ");
        }
    }

    public static Object removeSecond(Queue queue)
    {
        if(queue.isEmpty())
            return null;
        long first = queue.remove();
        Object valueToReturn = queue.isEmpty()  ?   null : queue.remove();

        queue.insert(first);
        System.out.print(valueToReturn);
        return valueToReturn;

    }

    public void reverse(Queue queue2)
    {
        if(!queue2.isEmpty())
        {
            long temp = queue2.remove();
            reverse(queue2);
            queue2.insert(temp);
        }
        display(queue2);
    }

}

//--------------------------------------------------------------
// end class Queue
////////////////////////////////////////////////////////////////
