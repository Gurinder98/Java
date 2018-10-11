
/**
 * Gurinder Singh
 * 1152715
 * 9/22/18
 * @version (a version number or a date)
 */
class StackX
{
    private int maxSize;        // size of stack array
    private long[] stackArray;
    private int top;            // top of stack
    private int nElems;
    //--------------------------------------------------------------
    public StackX(int s)         // constructor
    {
        maxSize = s;             // set array size
        stackArray = new long[maxSize];  // create array
        top = -1;                // no items yet
        nElems = 0;
    }
    //--------------------------------------------------------------
    public void push(long j)    // put item on top of stack
    {
        nElems++;
        stackArray[++top] = j;     // increment top, insert item

    }
    //--------------------------------------------------------------
    public long pop()           // take item from top of stack
    {
        //nElems--;
        //return stackArray[top--];  // access item, decrement top
        long temp = stackArray[top];
        stackArray[top] =0;
        top--;
        return temp;

    }
    //--------------------------------------------------------------
    public long peek()          // peek at top of stack
    {
        return stackArray[top];
    }
    //--------------------------------------------------------------
    public boolean isEmpty()    // true if stack is empty
    {
        return (top == -1);
    }
    //--------------------------------------------------------------
    public boolean isFull()     // true if stack is full
    {
        return (top == maxSize-1);
    }

    public int size()
    {
        return nElems;
    }

    
    public void display(StackX arr)
    {
        while(!arr.isEmpty())
        {
            long value = arr.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        //System.out.println("");
    }

    public void removeDownTo(StackX stack, long ob)
    {
        while(!stack.isEmpty())
        {
            if(stack.peek() != ob)
            {
                stack.pop();
            }
            else 
                display(stack);                 
        }
    }

    public void transfer(StackX s, StackX t)
    {
        StackX m = new StackX(s.size());
        StackX n = new StackX(t.size());
        StackX stack2 = new StackX(s.size() + t.size());
        while(!s.isEmpty())
        {
            long num1 = s.pop();
            m.push(num1);
            
        }
        
        while(!t.isEmpty())
        {
            long num2 = t.pop();
            n.push(num2);

        }

        while(!n.isEmpty() && !stack2.isFull())
        {
            long num3 = n.pop();
            
            stack2.push(num3);
            

        }

        while(!m.isEmpty() && !stack2.isFull())
        {
            long num4 = m.pop();
            stack2.push(num4);
        }
        display(stack2);

    }
}
//--------------------------------------------------------------
// end class StackX
////////////////////////////////////////////////////////////////

